package cas_260204_01;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		System.out.println(rand.nextInt(100-80)+80);
		
		
		int [] niz = popuni_niz(20);
		stampa_niz(niz);
		
		System.out.println(niz[0]);
		
		System.out.println(je_u_nizu(28, niz));
		System.out.println(max_el_niza(niz));
		

	}
	/*
	 * Varaca slucajan broj iz intervala od m do n
	 */
	
	public static int slucajan_broj(int m, int n) {
		if(m>n) {
			int p=m;
			m=n;
			n=p;
		}
		//Math.random();  vraca slucajan broj iz intervala od 0 do 1
		return (int)(Math.random()*(n-m))+m;
		
	}
	
	/*
	 * Funkcije popunjava niz
	 */
	public static int [] popuni_niz(int n) {
		int [] niz = new int[n];
		
		for (int i=0; i<niz.length; i++) {
			niz[i] = slucajan_broj(10, 100);
		}
		return niz;
	}
	
	/*
	 * Funkcija koja stampa niz
	 */
	
	public static void stampa_niz(int [] niz) {
		for (int element : niz) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	
	/*
	 * Funkcija koja provjerava da li se odredjeni element 
	 * nalazi u nizu
	 */
	
	public static boolean je_u_nizu(int x, int [] niz) {
	
		/*
		for (int element : niz) {
			if(element==x) {
				return true;
			}
		}
		*/
		for (int i = 0; i < niz.length; i++) {
			if(niz[i]==x) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Vraca najveci element u nizu
	 */
	
	public static int max_el_niza(int[]niz) {
		int max=0;
		for (int i = 0; i < niz.length; i++) {
			if(niz[max]<niz[i]) {
				max=i;
			}
		}
		return niz[max];
	}

}
