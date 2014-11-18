package model;

import java.util.Observable;

public class Carte extends Observable {
	
	Case [][] grille=new Case[10][10];
	
	
	public Carte(){
		
				
	
	}
	
	public Case getcase(int i,int j){
		
		return this.grille[i][j];
	}
	
		
	public void setcase(Navire navire,int i,int j){
		this.grille[i][j].navire=navire;
		this.grille[i][j].etat=true;
				
	}
	
	public boolean Placernavire(Navire navire,int i1,int j1,int i2,int j2){
		
		if ((this.grille[i1][j2].etat)||(this.grille[i2][j2].etat)){
			
			
			return false;
								
		}
		else{
			
			this.setcase(navire,i1,j1);
			this.setcase(navire,i2,j2);
			return true;
		}
		
	}
	
	
public boolean Placementnavire(Navire navire,int i1,int j1,int i2,int j2,int i3,int j3){
		
		if((this.grille[i1][j1].etat)||(this.grille[i2][j2].etat)||(this.grille[i3][j3].etat)){
			
			return false;
			}
		else{

			this.setcase(navire,i1,j1);
			this.setcase(navire,i2,j2);

			this.setcase(navire,i3,j3);
			
			
			return true;
			
		}
		
	}
	
	public boolean Placementnavire(Navire navire,int i1,int j1,int i2,int j2,int i3,int j3,int i4,int j4){
		
		if((this.grille[i1][j1].etat)||(this.grille[i2][j2].etat)||(this.grille[i3][j3].etat)||(this.grille[i4][j4].etat)){
			
			return false;
			}
		else{

			this.setcase(navire,i1,j1);
			this.setcase(navire,i2,j2);

			this.setcase(navire,i3,j3);
			this.setcase(navire,i4,j4);
			
			return true;
			
		}
		
	}
		
	
	public boolean Placementnavire(Navire navire,int i1,int j1,int i2,int j2,int i3,int j3,int i4,int j4,int i5,int j5){
		
		if((this.grille[i1][j1].etat)||(this.grille[i2][j2].etat)||(this.grille[i3][j3].etat)||(this.grille[i4][j4].etat)||(this.grille[i5][j5].etat)){
			
			return false;
			}
		else{

			this.setcase(navire,i1,j1);
			this.setcase(navire,i2,j2);

			this.setcase(navire,i3,j3);
			this.setcase(navire,i4,j4);
			this.setcase(navire, i5, j5);
			return true;
			
		}
		
	}

	
	
	public void  Placementnavirealéatoire() {
		
		
		
	}
	
	
	
}
