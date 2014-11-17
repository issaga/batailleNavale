package model;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Joueur {
	 private String nomJoueur;
	 private boolean humain;
	 private List flotte = new ArrayList();//liste des navires de la flotte
	 //declarer ici une carte de reference ou on va dessiner les navires du joueurs
	 
	 public Joueur(String nomJoueur, boolean humain){
		 this.nomJoueur = nomJoueur;
		 this.humain = humain;
	 }
	 
	 public void listeFlotteJoueur(InfosBateau infosNav){
		 switch(infosNav.getNameNav()){
		 	case "Porte_Avion":
		 		new PorteAvion(infosNav);
		 		break;
			case "Sous_Marin":
				new SousMarin(infosNav);
				break;
			case "Zodiac":
				new Zodiac(infosNav);
				break;
			case "Cuirassés_ Furtifs":
				new CuirassesFurtifs(infosNav);
				break;
		 }
	 }
	 
	 public void dessinerFlotte(Graphics2D g){
		 /*if(humain){
			 for(Navire nav : flotte){
				 nav.dessinerNavire(g);
			 }
		 }*/
	 }
	  
	 public String getNameJoueur(){
		 return nomJoueur;
		 }
	
	 public void test(){
		 String msg = "Ce n'est q'un test !!";
	 }
	 
}
