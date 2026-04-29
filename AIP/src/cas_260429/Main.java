package cas_260429;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	// provjerava da li je broj prost
	
	public static boolean jeProst(int n) {
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	// varaca broj cifara
	
	public static int jeParanBrojaCifara(int n) {		
		int duzina = (int)(Math.log10(n)+1);
		
		duzina = String.valueOf(n).length();
		
		// 3. nacin pomocu while petlje
		duzina = 0;
		while(n>0) {
			duzina++;
			n/=10;
		}
		
		return duzina;
	}
	
	/*
	 * Napisati funkciju koja iz zadatog niza stampa proste brojeve
	 * koji imaju neparan broj cifara
	 */
	
	public static void stampaBrojeve(int [] x) {
		
	}
	
	// vraca slucajan broj izmedju m i n
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
			niz[i] = slucajan_broj(1, 999);
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
	
}
