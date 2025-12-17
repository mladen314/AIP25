package cas_251105;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stampa apsolutnu vrijednost unijetog broja
		 */
		
		Scanner input = new Scanner(System.in);
		int x;
		
		System.out.println("Unijeti cijeli broj:");
		x = input.nextInt();
		int y = x;
		if(x>=0) {
			System.out.println("|"+y+"|="+x);
		}else {
			x=-x;
			System.out.println("|"+y+"|="+x);
		}
		
		/*
		 * Unose se dva broja i aritmeticka operacija, 
		 * u zavisnosti unesene operacije izvrsava se odgovarajuca operacija
		 * (+, -, *, /)
		 */
		int a, b, c;
		char o;
		System.out.println("Unijeti dva cijela broja");
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println("Unijeti operaciju (+, -, *, /):");
		o = input.next().charAt(0);
		if(o=='+'){
			  c = a+b;
			  System.out.println(a+"+"+b+"="+c);
		} else if(o=='-'){
			  c = a-b;
			  System.out.println(a+"-"+b+"="+c);
		}else if(o=='*'){
			  c = a*b;
			  System.out.println(a+"*"+b+"="+c);
		}else if(o=='/'){
			  c = a/b;
			  System.out.println(a+"/"+b+"="+c);
		}else {
			System.out.println("Nepostojeca operacija");
		}
		
		
		
	}

}
