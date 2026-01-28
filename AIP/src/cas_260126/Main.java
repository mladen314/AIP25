package cas_260126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti izraz");
		String izraz = input.next();
		
		System.out.println(izraz(izraz));

	}
	
	/*
	 * Funkcija koja izvrsava izraz koji je dat u obliku stringa
	 * 
	 */
	
	public static float izraz(String s) {
		
		int op;
		int plus = s.indexOf("+");
		int minus = s.indexOf("-");
		int puta = s.indexOf("*");
		int podjeljeno = s.indexOf("/");
		
		op = plus+minus+puta+podjeljeno+3;
		
		int prvi = Integer.parseInt(s.substring(0,op));
		int drugi = Integer.parseInt(s.substring(op+1)); 
		
		switch (s.charAt(op)) {
		case '+': {
			return prvi+drugi;
		}
		case '-': {
			return prvi-drugi;
		}
		case '*': {
			return prvi*drugi;
		}
		case '/': {
			float x= (float)prvi/drugi;
			x = (float)Math.round(x*100)/100;
			return x;
		}
		default:
			System.out.println("Nepoznata operacija");
			return 0;
		}

	}

}
