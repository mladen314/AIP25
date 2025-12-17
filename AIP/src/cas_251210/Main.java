package cas_251210;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Uneijeti cijeli broj:");
		int x = input.nextInt();
		//int s = sumaCifara(x);
		if(jeProst(sumaCifara(x))) {
			System.out.println("Suma cifara broja "+x+" je prost broj");
		}else {
			System.out.println("Suma cifara broja "+x+" je nije prost broj");
		}
		
	}
	
	/*
	 * provjerava da li je suma cifara prost broj
	 */
	
	public static int sumaCifara(int n) {
		int s=0;
		while(n>0) {
			s+=n%10;
			n/=10;
		}
		return s;
	}
	
	public static boolean jeProst(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
}
