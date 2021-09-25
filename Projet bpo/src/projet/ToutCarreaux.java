package projet;

import java.util.ArrayList;

public class ToutCarreaux {
	private static final int NB_MAX_CARREAUX = 9;
	/*private static final int HAUTEUR_MAX = 3;
	private static final int LARGEUR_MAX = 3;*/
	private ArrayList<String> lstStringBleus;
	private ArrayList<String> lstStringRouges;
	private ArrayList<Carreau> lstCarrBleus;
	private ArrayList<Carreau> lstCarrRouges;
	private char lettre;
	
	
	public ToutCarreaux(){
		setLstCarrBleus(new ArrayList<Carreau>());
		lstCarrRouges = new ArrayList<Carreau>();
		lstStringBleus = new ArrayList<String>();
		lstStringRouges = new ArrayList<String>();
	}
	
	
	
	public void creerCarreauxBleus(){
		int cpt = 1;
		int cpt2 = 1;
		lettre = 97;
		for (int i = 0; i < NB_MAX_CARREAUX-7 ; ++i) {
			Carreau c = new Carreau();
			
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt++;
			this.getLstCarrBleus().add(c);
		}
		
		for (int i = 0; i < NB_MAX_CARREAUX-6 ; ++i) {
			Carreau c = new Carreau();
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt2++;
			this.getLstCarrBleus().add(c);
		}
		cpt=1;
		cpt2=3;
		for (int i = 0; i < NB_MAX_CARREAUX-7 ; ++i) {
			Carreau c = new Carreau();
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt++;
			this.getLstCarrBleus().add(c);
		}
		cpt2=2;
		cpt=1;
		for (int i = 0; i < NB_MAX_CARREAUX-7 ; ++i) {
			Carreau c = new Carreau();
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt++;
			this.getLstCarrBleus().add(c);
		}
		
		
	}
	
	public void creerCarreauxRouges(){
		int cpt = 1;
		int cpt2 = 1;
		lettre = 65;
		for (int i = 0; i < NB_MAX_CARREAUX-7 ; ++i) {
			Carreau c = new Carreau();
			
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt++;
			this.lstCarrRouges.add(c);
		}
		
		for (int i = 0; i < NB_MAX_CARREAUX-6 ; ++i) {
			Carreau c = new Carreau();
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt2++;
			this.lstCarrRouges.add(c);
		}
		cpt=1;
		cpt2=3;
		for (int i = 0; i < NB_MAX_CARREAUX-7 ; ++i) {
			Carreau c = new Carreau();
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt++;
			this.lstCarrRouges.add(c);
		}
		cpt2=2;
		cpt=1;
		for (int i = 0; i < NB_MAX_CARREAUX-7 ; ++i) {
			Carreau c = new Carreau();
			c.setHauteur(cpt);
			c.setLargeur(cpt2);
			c.setLettre(lettre);
			lettre++;
			cpt++;
			this.lstCarrRouges.add(c);
		}
		
		
	}
	
	
	public void creerStringCarreauxBleus(){
		assert lstStringBleus.size()==NB_MAX_CARREAUX;
		for (int i = 0; i < NB_MAX_CARREAUX ; ++i) {
			Carreau c = new Carreau();
			String s = new String();
			c = getLstCarrBleus().get(i);
			//int taille = c.getTaille();
			for (int j = 0 ; j < c.getHauteur() ; ++j) {
				for (int k = 0; k<c.getLargeur(); k++) {
					s+= c.getLettre();
				}
				s += "\n";
			}
			lstStringBleus.add(s);
		}
	}

	public void creerStringCarreauxRouges(){
		assert lstStringRouges.size()==NB_MAX_CARREAUX;
		for (int i = 0; i < NB_MAX_CARREAUX ; ++i) {
			Carreau c = new Carreau();
			String s = new String();
			c = lstCarrRouges.get(i);
			//int taille = c.getTaille();
			for (int j = 0 ; j < c.getHauteur() ; ++j) {
				for (int k = 0; k<c.getLargeur(); k++) {
					s+= c.getLettre();
				}
				s += "\n";
			}
			lstStringRouges.add(s);
		}
	}


	public int getHListe(int i) {
		 Carreau c = this.getLstCarrBleus().get(i);
		 return c.getHauteur();
	}
	public int getLListe(int i) {
		 Carreau c = this.getLstCarrBleus().get(i);
		 return c.getLargeur();
	}



	public String getStrListeBleus(int i) {
		
		return lstStringBleus.get(i);
	}
	public String getStrListeRouges(int i) {
		
		return lstStringRouges.get(i);
	}



	public ArrayList<Carreau> getLstCarrBleus() {
		return lstCarrBleus;
	}



	public void setLstCarrBleus(ArrayList<Carreau> lstCarrBleus) {
		this.lstCarrBleus = lstCarrBleus;
	}



	public ArrayList<Carreau> getlstCarrRouges() {
		// TODO Auto-generated method stub
		return lstCarrRouges;
	}
	
}
