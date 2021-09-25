package projet;

import java.util.Random;

public class Carreau {
	/*private static final int HAUTEUR_MAX=3;
	private static final int LARGEUR_MAX=3;*/
	private int  largeur;
	private int hauteur;
	private char lettre;
	//private int taille;
	//private char[][] typeCarreau;
	
	public Carreau(){
		largeur=1;
		hauteur=1;
		lettre='a';
		
	}
	
	public Carreau(int larg,int haut) {
		largeur=larg;
		hauteur=haut;
		lettre='l';
		
	}
	

	public int getHauteur() {
		return this.hauteur;
	}
	
	public int getLargeur() {
		return this.largeur;
	}
	
	public char getLettre() {
		return lettre;
	}
	
	public void setLettre(char l) {
		lettre = l;
	}
	
	public void setHauteur(int h) {
		this.hauteur=h;
	}
	public void setLargeur(int l) {
		this.largeur=l;
	}
	
	
	
	public void setNeutre() {
		
		Random random = new Random();
		int indic ;
		indic = random.nextInt(2);
		
		if (indic==0) {
			largeur=3;
			hauteur=1;
		}
		else {
			largeur=1;
			hauteur=3;
		}
	}
}
