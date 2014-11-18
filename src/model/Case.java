package model;

import java.util.Observable;

public class Case extends Observable {
	
	Navire navire; //reference au bateau positionné dans cette case
	boolean etat; // precise si elle est occupé ou pas
	
	
	public Case(int id,boolean etat){
		this.navire=null;
		this.etat=false;
	}
	
	public Navire getbatiment(){
		
		return this.navire;
		}

	
	public boolean getetat(){
		return this.etat;
	}
	
	public void setetat(boolean etat){
		this.etat=etat;
		notify();
		
	}
	
	public void setnavire(Navire navire){
		
		this.navire=navire;		
	}
	
}
