package cas251223;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// provjerava da li je proizvod cifara paran broj
    Scanner input  = new Scanner(System.in);
    System.out.println("unijeti broj");
    int x= input.nextInt();
    int p= proizvodCifara(x);
    proizvodCifara(x);
    if (jeParan(p)) {
    	System.out.println("jeste paran");
    	
    	
    }else {
    	System.out.println("nije paran");
    }
	}

	
	public static int proizvodCifara(int n) {
		int P=1;
		while (n>0) {
			int c=n%10;
			n=n/10;
			P=P*c;
		}
		return P;
		
	}
	public static boolean jeParan(int h ) {
		if (h%2==0) {
			return true;
		}
		return false;
	}

}
