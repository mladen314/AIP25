package cas_260401;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unijeti broj: ");
		int n=input.nextInt();
		
		System.out.println("Broj je palindrom: "+jePalindrom(n));
		
		System.out.println(binUdek(n));
		
	}
	
	public static boolean jePalindrom(int n) {
		if (n<10)
		{
			return true;
		}
		int br = (int)(Math.log10(n));
		int p = n/(int)(Math.pow(10, br));
		int z = n%10;
		if(p!=z) {
			return false;
		}
		return jePalindrom(n%(int)Math.pow(10, br)/10);
		
	}
	
	public static int binUdek(int n) {
		if(n<=1) {
			return n;
		}
		
		return n%10+2*binUdek(n/10);
	}

}
