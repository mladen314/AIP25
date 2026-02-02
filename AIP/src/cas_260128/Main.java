package cas_260128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti string");
		String s = input.nextLine();
		
		System.out.println(br_samoglasnika(s));
		System.out.println(naopako(s));
		System.out.println(je_palindrom(s));
		System.out.println(broj_rijeci(s));

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
		String pom=s.substring(s.length()-1);
		
		for(int i=s.length()-2; i>=0;i--) {
			pom=pom+s.charAt(i);
		}
		return pom;
	}
	
	
	/*
	 * Provjerava da li je string palindrom. Isto se cita sa obije strane.
	 * Npr. za "radar" vraca true
	 */
	
	public static boolean je_palindrom(String s) {
		String pom = naopako(s);
		
		if(s.equalsIgnoreCase(pom)) {
			return true;
		}
		
		return false;
	}
	
	
	/*
	 * Vraca broj rijeci u stringu (recenici)
	 */
	
	public static int broj_rijeci(String s) {
		int br=1;
		
		for(int i=0;i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				br++;
			}
		}
		return br;
	}

}
