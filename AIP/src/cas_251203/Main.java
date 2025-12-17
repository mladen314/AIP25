package cas_251203;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unijeti dva cijela broja");
		int a=input.nextInt();
		int b=input.nextInt();
		stampaSumu(a, b);
		int x = sumaCifara(a);
		
		if(x%2==0) {
			System.out.println("Suma cifara je paran broj");		
			
		}
		
	
	}
	
	/*****************************/
	
	public static void stampaSumu(int a, int b) {
		int s = a+b;
		System.out.println("Suma brojeva "+a+" i "+b+" je "+s);
	}
	
	/*****************************/
	
	public static int sumaCifara(int n) {
		int s=0;
		while(n>0) {
			s+=n%10;
			n/=10;
		}
		return s;
	}
	
	/*****************************/

}
