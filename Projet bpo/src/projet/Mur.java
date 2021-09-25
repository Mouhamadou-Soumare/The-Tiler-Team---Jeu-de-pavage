package projet;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.LinkedList;
import java.util.Random;

public class Mur {
	private static final int LARGEUR = 5;
	private int hauteur;
	private ArrayList<char[]> mur;
	private HashMap<Carreau, Coordonnees> mapMur;
	

	
	public Mur(){
		Carreau neutre = new Carreau();
		neutre.setLettre('x');
		neutre.setNeutre();
		
		mur = new ArrayList<char[]>();
		for (int i=0;i<=hauteur+1;i++){
			char[] ligne = new char[5];
			Arrays.fill(ligne,' ');
			mur.add(ligne);
		}
		
		Random random = new Random();
		int xNeutre;
		xNeutre = random.nextInt(5);
		int yNeutre = 0;
		
		while (xNeutre+neutre.getLargeur()>=5) {
			xNeutre = random.nextInt(5);
		}
		ajouterCarreau(neutre,xNeutre,yNeutre);
	}
	
	
	public void ajouterCarreau(Carreau c,int x,int y){
		//if (reguler(c,x,y)) {
		for (int i=0 ; i<c.getHauteur() ; ++i) {
			for (int j=0 ; j<c.getLargeur() ; ++j) {
				mur.get(y+i)[x+j] = c.getLettre();	
			}
		}	
		//}	
	}
	
	private boolean reguler(Carreau c, int x, int y){
	
		if (x+c.getLargeur()>=LARGEUR) {
			return false;
		}
		else if (mur.get(y)[x]!=' ' || mur.get(y)[x+1]!=' ' || mur.get(y)[x+c.getLargeur()-1]!=' ') {
			return false;
		}
		else if(mur.get(y-1)[x]==' ' || mur.get(y-1)[x+1]==' ' || mur.get(y-1)[x+c.getLargeur()-1]==' ') {
			return false;
		}
		else if (mur.get(y-1)[x] == Character.toUpperCase(c.getLettre())) {
			if (mur.get(y-1)[x]== mur.get(y-1)[x-1])
				return false;
		}
		else if ()
		/*else if(mur.get(y-1)[x+c.getLargeur()]!= mur.get(y-1)[x+c.getLargeur()-1] && mur.get(y-1)[x-1]!=mur.get(y-1)[x]) {
			if (mur.get(y-1)[x]== mur.get(y-1)[x+1] && mur.get(y-1)[x+1]==mur.get(y-1)[]) 
				return false;
			
		}*/
		return true;
		/*if (c.getHauteur()==1 && c.getLargeur()==1) {
			
			if (mur.get(y)[x]== ' ')
				
				if(mur.get(y)[x+1]== ' ' || mur.get(y)[x-1]==' ' || mur.get(y+1)[x] == ' ' && mur.get(y-1)[x] !=' ' && mur.get(y-1)[x-1]!= ' '  && mur.get)
					if();
					
					
			
		}
		else {
		
				
				
					
					if (mur.get(y+1)[x+c.getLargeur()-1]== ' ') 
						
						if(mur.get(y+c.getHauteur()-1)[x+1]== ' ') 
							
							if(mur.get(y+1)[x+1]== ' ') 
								
								if(mur.get(y+c.getHauteur()-1)[x+c.getLargeur()]==' ' || mur.get(y+1)[x+c.getLargeur()] == ' ' ||mur.get(y)[x+c.getLargeur()] == ' ' )
									
									if(mur.get(y)[x-1]==' ' || mur.get(y+1)[x-1] ==' '|| mur.get(y+c.getHauteur()-1)[x-1] ==' ' )
										
										if(mur.get(y-1)[x]!=' '&& mur.get(y-1)[x+1] != ' ' && mur.get(y+1)[x+c.getLargeur()-1] !=' ' ) 
											
											return true;
		}*/
	
	}
	
	public String toString(){
		String s = new String();
		s="";
		for (int i=hauteur-1; i>=0;--i){
			for (int j =0;j<LARGEUR;++j ){
				s += Character.toString(mur.get(i)[j]);
			}
			s+=("\n");	
		}
		
		return s;
		
		
	}
		    

}