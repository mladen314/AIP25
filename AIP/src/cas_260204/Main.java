package cas_260204;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int [] niz;
		niz = new int[10]; // niz[0], niz[1], niz[2],... niz[9]
		System.out.println(niz.length);
		
		int n = 15;
		double [] x = new double[n];
		System.out.println(x.length);
		
		String [] s = {"Ana", "Marko", "Jelena", "Janko"};
		System.out.println(s.length);
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[1]);
		s[2] = "Ivan"; 
		System.out.println(s[2]);
		int m = 2;
		System.out.println(s[m]);
		
		System.out.println("Elementi niza s (preko indeksa): ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+"-ti element je "+s[i]);
		}
		
		System.out.println("Elementi niza s (foreach): ");
		
		for (String element : s) {
			System.out.println(element);
		}
		
		System.out.println(String.join(" ", s));
		
		
	}

}
