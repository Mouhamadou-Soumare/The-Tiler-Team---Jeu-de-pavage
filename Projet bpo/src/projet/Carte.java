package projet;

import java.util.ArrayList;

public class Carte {

	 public enum Couleur{
		ROUGE,BLEUE
		 /* ROUGE1,ROUGE2,ROUGE3,ROUGE4,ROUGE5,ROUGE6,ROUGE7,ROUGE8,ROUGE9,BLEUE1,BLEUE2,BLEUE3,BLEUE4,BLEUE5,BLEUE6,BLEUE7,BLEUE8,BLEUE9*/
	 }
	 
	 public enum Taille{
		TAILLE1,TAILLE2,TAILLE3
		 /*TAILLE1_1,TAILLE1_2,TAILLE1_3,TAILLE1_4,TAILLE1_5,TAILLE2_1,TAILLE2_2,TAILLE2_3,TAILLE2_4,TAILLE2_5,TAILLE3_1,TAILLE3_2,TAILLE3_3,TAILLE3_4,TAILLE3_5*/
	 }


	 
	 private Taille taille;
	 private Couleur couleur;
	 private ArrayList<Carreau> valeur;
	 
	public Carte(Couleur couleur,ToutCarreaux tc) {
		
		this.couleur=couleur;
		
		Couleur [] couleurs=Couleur.values();
		
		if(couleur==couleurs[0])
			valeur=tc.getLstCarrBleus();
		
		if(couleur==couleurs[1])
			valeur=tc.getlstCarrRouges();
	}
	
	public Carte(Taille taille, Carreau lm) {
		this.taille=taille;
		Taille[] tailles=Taille.values();
		if (taille==tailles[0]) {
			Carreau c=new Carreau(1,1,'a');
			
	}
	
	
	 
	 public Couleur getCouleur() {
		 return this.couleur;
	 }
	 public Taille getTaille() {
		 return this.taille;
	 }
	 
	/* public Carte carteEnJeu(Paquet p,ToutCarreaux tc) {
		 
		 Carte c=new Carte(Couleur.ROUGE);
		 Carte c1=new Carte(Couleur.BLEUE);
		 Carte c2=new Carte(Taille.TAILLE1);
		 Carte c3=new Carte(Taille.TAILLE2);
		 Carte c4=new Carte(Taille.TAILLE3);
		 
		 if(p.depiler()==c)
			 c
		 
		 
		 return  c;
	 }*/
	 
	 
	 
	public String toString() {
		String s="";
		
		
		
		
	
		return s;
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * enum couleur{
				rouge1,rouge2,rouge3,rouge4,rouge5,rouge6,rouge7,rouge8,rouge9,
				bleue1,bleue2,bleue3,bleue4,bleue5,bleue6,bleue7,bleue8,bleue9,};
	enum taille{
				taille1_1,taille1_2,taille1_3,taille1_4,taille1_5,
				taille2_1,taille2_2,taille2_3,taille2_4,taille2_5,
				taille3_1,taille3_2,taille3_3,taille3_4,taille3_5
	}

	 * 
	 * private int taille;
	private String couleur;
	private int nbCartes;
	
	public Carte(int taille) {
		this.taille=taille;
	}
	
	
	
	public Carte(String couleur) {
		this.couleur=couleur;
	}
	
	public void estRouge() {
		
	}
	
	public void setNbCartes(int n) {
		assert(n>=0);
		this.nbCartes=n;
	}**/
	

 