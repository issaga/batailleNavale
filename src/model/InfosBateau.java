package model;

import java.util.ArrayList;
import java.util.List;

public class InfosBateau{
	private String orientation;
	private String nameNavire;
	private List listeCases = new ArrayList(); //liste des cases occupées !
	 
	public InfosBateau(String orientation, String nameNavire, List listeCases){
	this.orientation = new String(orientation); 
	this.nameNavire = new String(nameNavire);
	this.listeCases = listeCases;
	}
	
	public String getOrientation(){
		return orientation;
	}
	public String getNameNav(){
		return nameNavire;
	}
	public List getListeCases(){
		return listeCases;
	}
	
	public int size(){
		return this.listeCases.size();
	}

}
