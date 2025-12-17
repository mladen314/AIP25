package cas_251208;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x, y;
		String op;
		System.out.println("Unijeti prvi broj:");
		x=input.nextInt();
		
		System.out.println("Unijeti operaciju:");
		op=input.next();
		
		System.out.println("Unijeti drugi broj:");
		y=input.nextInt();
		
		kalkulator(x, y, op);
		
		input.close();
		
	}
	
	/*
	 * Napisati funkciju kalkulator
	 */
	
	public static void kalkulator(int a, int b, String op) {
		double s;
		switch (op) {
		case "+":
			s=a+b;
			break;
		case "-":
			s=a-b;
			break;
		case "*":
			s=a*b;
			break;
		case "/":
			if(b==0) {
				System.out.println("Nemoguce dijeljenje sa nulom");
				return;
			}
			s=(double)a/b;   //k=((double)a)/b;
			s=(double)Math.round(s*100)/100; //k=((double)Math.round(k*100))/100;
			break;	
		default:
			System.out.println("Nepravilna operacija");
			return;
			
		}
		
		System.out.println(a+op+b+"="+s);
		
	}

}
