package cas_251105_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Stampa da li skola radi i koja je smjena trenutno ili skola ne radi
		 * ili je nepravilno vrijeme
		 * 8-14 A smjena
		 * 14-20 B smjena	 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unijeti vrijeme");
		int t = input.nextInt();
		
		if(t>=8 && t<14) {
			System.out.println("Skola radi i trenutno je A smjena");
		}else if(t>=14 && t<20) {
			System.out.println("Skola radi i trenutno je B smjena");
		}else if(t>=0 && t<24) {
			System.out.println("Skola ne radi");
		}else {
			System.out.println("Nepravilno vrijeme");
		}
		
	}

}
