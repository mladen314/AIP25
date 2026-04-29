package cas_260427;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * {111,121,122,421,525,84}
		 * a) Prvi broj sa najvise parnih cifara -> 122
		 * b) Poslednji broj sa najvise parnih cifara -> 84
		 * c) Vraca najveci broj sa najvise parnih cifara -> 421
		 */
		
		
		int []niz = {111,121,122,421,525,84};
		System.out.println(pod_a(niz));
		System.out.println(pod_b(niz));
		System.out.println(pod_c(niz));
		

	}
	
	public static int broj_parnih(int x) {
		int br=0;
		while (x>0) {
			if (x%2==0) {
				br++;
			}
			x=x/10;
		}
		return br;
		
	}
	
	
	public static int pod_a(int []niz) {
		int max=0;
		for (int i = 1; i<niz.length; i++) {
			if (broj_parnih(niz[max]) < broj_parnih(niz[i])) {
				max = i;
			}
		}
		return niz[max];
		
	}
	
	public static int pod_b(int []niz) {
		int max=0;
		for (int i = 1; i<niz.length; i++) {
			if (broj_parnih(niz[max]) <= broj_parnih(niz[i])) {
				max = i;
			}
		}
		return niz[max];
		
	}
	
	public static int pod_c(int []niz) {
		int max=0;
		for (int i = 1; i<niz.length; i++) {
			if ((broj_parnih(niz[max]) < broj_parnih(niz[i]))||(broj_parnih(niz[max]) == broj_parnih(niz[i])&& niz[max]<niz[i])) {
				max = i;
			}
		}
		return niz[max];
		
	}

}
