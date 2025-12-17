package cas_251027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * stampa povrsinu i obim pravouglog trougla za unesene katete
		 */
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		double p, o;
		
		System.out.println("Unijeti katete (int):");
		a = input.nextInt();
		b = input.nextInt();
		
		double c = Math.sqrt(a*a+Math.pow(b, 2));
		System.out.println("c="+c);
		
		c=(double)Math.round(c*100)/100;
		System.out.println("c="+c);
		
		p=(double)(a*b)/2;
		o=a+b+c;
		
		System.out.println("Povrsina je "+p);
		System.out.println("Obim je "+o);
		
		

	}

}
