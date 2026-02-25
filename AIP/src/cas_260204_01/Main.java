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
		
		System.out.println("Suma elemenata niza je " + suma_el(niz));
		
		parni_br_niza(niz);
		
		int [] pom = {1,2,3,4,5,6};
		int [] treci = treci_niz(niz,pom);
		stampa_niz(treci);
		
		System.out.println(najvise_ponavljanja(niz));
		

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
	
	/*
	 * Vraca sumu elemenata niza
	 */
	public static int suma_el(int niz[]) {
		int suma = 0;
		for (int element : niz) {
			suma = suma + element;
		}
		return suma;
		
	}
	
	/*
	 * Stampa parne brojeve iz niza 
	 */
	
	public static void parni_br_niza(int niz[]) {
		System.out.print("Parni brojevi niza su: ");
		for (int broj : niz) {
			if (broj%2==0) {
				System.out.print(broj + " ");
			}
			
		}
		System.out.println();
	}
	
	
	
	/*
	 * Od dva niza pravi treci niz 
	 * koji nastaje nadovezivanjem prva dva niza
	 */
	
	
	public static int[] treci_niz(int []niz1, int []niz2) {
		int [] treci = new int [niz1.length + niz2.length];
		
		for (int i = 0; i < niz1.length; i++) {
			treci[i] = niz1[i];
		}
		
		for (int i = 0; i < niz2.length; i++) {
			treci[niz1.length + i] = niz2[i];
		}
		return treci;
		
	}
	
	
	/*
	 * Vraca element niza koji se navise puta pojavljuje
	 * ukoliko ih je vise sa istim brojem ponavljanja vraca
	 * onaj koji se prvi pojavljuje u nizu
	 */
	
	public static int najvise_ponavljanja(int[] niz) {
		int pon_max=0;
		int index=0;
		for (int i = 0; i < niz.length; i++) {
			int pon=0;
			for (int j = i; j < niz.length; j++) {
				if(niz[i]==niz[j]) {
					pon++;
				}
			}
			if(pon>pon_max) {
				index=i;
				pon_max=pon;
			}
		}
		return niz[index];
	}
	

}
