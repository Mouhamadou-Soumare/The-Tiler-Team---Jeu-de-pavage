package projet;


import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Random;




public class Paquet {
	private static final int NB_CARTES = 33;
	private ArrayList<Carte> crt;
	
	
	public Paquet(Carte c) {
		this.crt=new ArrayList<Carte>();
		for(int i=0;i<9;i++)
		{
			Carte c1= new Carte(c.getCouleur() );
			this.crt.add(c1);
		}
		for(int j=0;j<9;j++) {
			Carte c2= new Carte(c.getCouleur());
			this.crt.add(c2);
		}
		for(int k=0;k<5;k++) {
			Carte c3=new Carte(c.getTaille());
			this.crt.add(c3);
		}
		for(int l=0;l<5;l++) {
			Carte c4=new Carte(c.getTaille());
			this.crt.add(c4);
		}
		for(int m=0;m<5;m++) {
			Carte c5=new Carte(c.getTaille());
			this.crt.add(c5);
		}
		
}
	
	


	
	public boolean estVide() {
		if(crt.isEmpty())
			return true;
		else 
			return false;
	}
	
	public void empiler(Carte c) {
		for (int i=0;i<= NB_CARTES;i++)
			crt.add(c);
		 
		  /*crt.push(c);*/ 
		 
	}
	
	public Carte  depiler() {
 		
		if(!estVide())
			return crt.remove(size()-1);
		else
			throw new EmptyStackException();
	}
	
	public int piocher(Carte c) {
		
		Random r = new Random();
		return r.nextInt(31)+1;
		
		
		
		
		
		/*switch(c.getCouleur()) {
		case BLEUE1:
			return "a";
		case BLEUE2:
			return "b";
		case BLEUE3:
			return "c";
		case BLEUE4:
			return "d";
		case BLEUE5:
			return "e";
		case BLEUE6:
			return "f";
		case BLEUE7:
			return "g";
		case BLEUE8:
			return "h";
		case BLEUE9:
			return "i";
		case ROUGE1:
			return "A";
		case ROUGE2:
			return "B";
		case ROUGE3:
			return "C";
		case ROUGE4:
			return "D";;
		case ROUGE5:
			return "E";;
		case ROUGE6:
			return "F";
		case ROUGE7:
			return "G";
		case ROUGE8:
			return "H";
		case ROUGE9:
			return "I";
		default:
			break;
		
		switch(c.getTaille()) {
		default:
			break;
			
		}*/
		/*for(Couleur clr:Couleur.values()) {
			return String.fromCharCode(c.charCodeAt(0)+1);
		}*/
		
	}
	


	public int size() {
		return crt.size();
	}
	
	/*public void melanger() {
		Random rand=new Random();
		for (int index=0;index<size();index++) {
			int randomIndex=rand.nextInt(size());
			Carte temp=crt.get(randomIndex);
			@SuppressWarnings("unused")
			Carte j=crt.get(randomIndex) ;
			j=crt.get(index);
			j=temp;
			
		}
	}*/
	
	public void melanger1() {
		Collections.shuffle(crt);
	}
	
	
}
