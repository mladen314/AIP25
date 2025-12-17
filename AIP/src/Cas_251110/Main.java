package Cas_251110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		/*
		 * 100 puta stampati rijec "informatika"
		 */

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ". Informatika");
		}

		/*
		 * parni brojevi manji od 50
		 */
		// i++ i=i+1
		// i-- i=i-1
		// i+=n i=i+n
		// i-=n i=i-n
		// i*=n i=i*n
		// i/=n i=i/n

		for (int i = 2; i < 50; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i < 25; i++) {
			int a = 2 * i;
			System.out.print(a + " ");
		}
		System.out.println();

		/*
		 * Racuna sumu prvih n neparnih brojeva
		 */

		System.out.println("Unesi prirodan broj:");
		int n = input.nextInt();

		int s = 0;
		int br = 1;
		for (int i = 1; br <= n; i++) {
			if (i % 2 != 0) {
				s = s + i; // s+=i;
				br++;
			}
		}

		System.out.println("Suma prvih " + n + " neparnih brojeva je " + s);

		// drugi nacin
		s = 0;
		br = 1;
		for (int i = 1; br <= n; i += 2) {
			s = s + i; // s+=i;
			br++;
		}

		System.out.println("Suma prvih " + n + " neparnih brojeva je " + s);

		// treci nacin
				s = 0;
				
				for (int i = 1; i <= n; i++) {
					s = s + 2*i-1; // s+=i;	
				}

				System.out.println("Suma prvih " + n + " neparnih brojeva je " + s);

		
		
		/*
		 * Provjerava da li je broj prost
		 */
				
				

	}

}
