package harsadovbroj;

import java.util.Scanner;

public class HarsadovBroj {

	/* zadatak da li je broj harsadov, tj da li ostatak pri dijeljenju sa sopstvenom sumom cifara daje 0 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner input = new Scanner(System.in);

	        System.out.print("Unesite broj za provjeru: ");
	        int broj = input.nextInt();
	        int suma = izracunajSumuCifara(broj);
	        if (daLijeDjeljiv(broj, suma)) {
	            System.out.println("Broj " + broj + " je Haršadov broj.");
	        } else {
	            System.out.println("Broj " + broj + " nije Haršadov broj, zato sto " + broj + " ne daje ostatak 0 pri dijeljenju sa " + suma);
	        }

	    }

	    public static int izracunajSumuCifara(int n) {
	        int s = 0;
	        while (n > 0) {
	            s = s + n % 10;
	            n /= 10;
	        }
	        return s;
	    }

	    public static boolean daLijeDjeljiv(int n, int s) {
	    	if(n%s==0) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    	
	}

}
