package cas_260128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti izraz");
		String s = input.nextLine();
		
		System.out.println(br_samoglasnika(s));

	}
	
	/*
	 * Napisati funkciju koja za unijeti string ispisuje 
	 * koliko ima samoglasinka (a, e, o , i , u). 
	 * Npr. za Informatika vraca 5
	 */
	
	public static int br_samoglasnika(String s) {
		int br=0;
		String pom = "aeoiuAEOUI";
		for(int i =0; i<s.length();i++) {
			if(pom.contains(s.substring(i, i+1))){
				br++;
			}
		}
		return br;
		
	}
	
	
	
	/*
	 * Napisati funkciju koja vraca predati string naopako 
	 * (npr. za informatika vraca akitamrofni)
	 */
	
	public static String naopako(String s) {
		
	}
	
	
	/*
	 * Provjerava da li je string palindrom. Isto se cita sa obije strane.
	 * Npr. za "radar" vraca true
	 */
	
	
	
	/*
	 * Vraca broj rijeci u stringu (recenici)
	 */

}
