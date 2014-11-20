package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class Navire {
		 
	private String nomNavire;
	private InfosBateau infosNav; // coordonnées de type (A6,A10)... 
	private Rectangle navire;
	private int taille;
	/*
	 * Concerne la methode coulée
	 * */
	public int life;
	private boolean coule = false;
		
	public Navire(InfosBateau infosNav,int t){
		this.nomNavire = infosNav.getNameNav();
		this.infosNav = infosNav;
		//this.life = infosNav.getListeCases().size();
		this.taille=t;
		
		
		if(infosNav.getOrientation().equals("vertical")){
			
		}else{//orientation horizontal
			
		}
	}
	
	

	public int getTaille() {
		return taille;
	}



	public boolean isCoule() {
		return coule;
	}

	public void dessinerNavire(Graphics2D g){ 
		g.setColor(Color.red);
		g.draw(navire);
		g.setColor(Color.blue);
		g.fill(navire);
	}
	
	public String getNomNav(){
		return nomNavire;
	}
	
	public void touche(){
		life--;
		if(life<=0){
			coule = true;
		}
	}

}
