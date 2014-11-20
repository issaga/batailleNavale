package controleur;

import javax.swing.JOptionPane;

import Modele.IA;
import Modele.Joueur;
import Vue.CarteGraphique;
import Vue.CarteGraphique2;
import Vue.InterfacePrincipal;

public class CarteControleur {

	private CarteGraphique carteGraphique;
	private CarteGraphique2 carteGraphique2;
	private Joueur joueurPrincipal;
	private IA ia;
	private boolean bateauInitialite;
	private InterfacePrincipal interfacePrincipal;


	public CarteControleur() {
		bateauInitialite = false;
	}


	/**
	 * Permet d'initialiser le controleur
	 * @param carteGraphique
	 * @param carteGraphique2
	 */
	public void initControleur(CarteGraphique carteGraphique, CarteGraphique2 carteGraphique2) {
		
		this.carteGraphique = carteGraphique;
		this.carteGraphique2 = carteGraphique2;

		joueurPrincipal = carteGraphique2.getInterfacePrincipal().getPartie().getJoueur(); 
		ia = carteGraphique2.getInterfacePrincipal().getPartie().getIa();

	}

	/**
	 * Permet de placer des bateaux aléatoirement sur la carte du joueur 
	 **/	
	public void PlacerBateau(){

		if(!bateauInitialite) {

			joueurPrincipal.placementAleatoire();

			for(int i = 0; i <5; i++) {
				carteGraphique.dessinerBateau(joueurPrincipal.getNavire(i));
			}

			bateauInitialite = true;
		}
	}
	
	/**
	 * Permet de dessiner les bateaux de l'IA
	 */
	public void VoirBateau(){

			for(int i = 0; i <5; i++) {
				carteGraphique2.dessinerBateauIA(ia.getNavireIA(i));
			}		
		
	}
	
/**
 * Permet de tirer sur la case(x,y)
 * @param x La Colonne 
 * @param y La Ligne
 * Elle verifie aussi si quelqu'un a gagné
 */

	public void TirerSurPosition(int x, int y) {

		if(bateauInitialite) {

			boolean succes = joueurPrincipal.TirerNavire(y-1, x-1, ia.getCarte());
			carteGraphique2.dessinerImpacte(x,y, succes);
			ia.ToucherNavireIA(y-1, x-1);
			
			if(joueurPrincipal.defaite()) {
				JOptionPane.showMessageDialog(interfacePrincipal,"Vous avez perdu.","Fin de la partie",JOptionPane.PLAIN_MESSAGE);
			}
			else if(ia.defaite()){
				JOptionPane.showMessageDialog(interfacePrincipal,"Vous avez gagné.","Fin de la partie",JOptionPane.PLAIN_MESSAGE);
			}
			TirerIA();
			
		} else {
			
			JOptionPane.showMessageDialog(interfacePrincipal,"Il faut placer vos bateaux.","Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Permet à l'IA de tirer sur la carte du joueur
	 */
	public void TirerIA() {
		int t = ia.TirerIA(joueurPrincipal.getMaCarte());
		joueurPrincipal.ToucherNavire(t);
		int y = (t/10)+1;
		int x = (t%10)+1;
		carteGraphique.dessinerImpactIA(x, y);
	}


}
