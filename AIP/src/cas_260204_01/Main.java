package cas_260204_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] niz = {5, 10, 28, 12, 26, 32, 42};
		
		
		System.out.println(je_u_nizu(28, niz));
		
		Math.random(); // vraca slucajan broj iz intervala od 0 do 1

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

}
