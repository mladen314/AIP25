package cas_251124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		/*
		 * Za uneseni broj stampamo koliko ima cifara
		 */

		System.out.println("Unijeti prirodni broj");
		int a = input.nextInt();
		int br = 0;
		int n = a;

		while (a > 0) {
			a /= 10;
			br++;
		}

		System.out.println("Broj " + n + " ima " + br + " cifara.");

		/*
		 * Stampa sumu cifara unijetog broja
		 */
		a = n;
		int s = 0;

		while (a > 0) {
			int c = a % 10;
			s += c;
			a /= 10; // a=a/10;
		}
		System.out.println("Suma cifara broja  " + n + " je " + s + ".");

		/*
		 * Stampa najvecu cifru unijetog broja
		 */
		System.out.println("1. zadatak");
		int x = input.nextInt();
		int y = x % 10;
		x = x / 10;
		int temp;
		while (x > 0) {
			temp = x % 10;
			x /= 10;
			if (y < temp) {
				y = temp;
			}
		}
		System.out.println("Najveca cifra unijetog broja je " + y);

		/*
		 * Stampa parne cifre unijetog broja
		 */
		System.out.println("2. zadatak");
		x = input.nextInt();
		while(x>0) {
			int c = x%10;
			x/=10;
			if(c%2==0) {
				System.out.print(c+", ");
			}
		}
		System.out.println();

		/*
		 * stampa da li je broj Hemingov (nema drugih prostih cinilaca sem 2, 3 i 5)
		 */
		System.out.println("3. zadatak");
		x = input.nextInt();
		while(x%2==0) {
			x/=2;
		}
		while(x%3==0) {
			x/=3;
		}
		while(x%5==0) {
			x/=5;
		}
		if(x==1) {
			System.out.println("Jeste Hemingov broj");
		}else{
			System.out.println("Nije Hemingov broj");
		}
		
		
		/*
		 * Stampa prvih n hemingovih brojeva
		 */
		System.out.println("4. zadatak");
		n = input.nextInt();
		br=0;
		int i=1;
		while(br<n) {  // for(int i=1;br<n;i++)
			int pom =i;
			while(pom%2==0) {
				pom/=2;
			}
			while(pom%3==0) {
				pom/=3;
			}
			while(pom%5==0) {
				pom/=5;
			}
			if(pom==1) {
				System.out.print(i+", ");
				br++;
			}
			i++;
		}
		System.out.println();
		
		/*
		 * Broj N nazivamo savrsenim ako je jednak zbiru svojih djelilaca
		 * ne racunajuci sami taj broj. 
		 * Napisati program koji provjerava da li je broj savrsen. 
		 * 6, 28, 496, 8128
		 */
		System.out.println("5. zadatak");
		n = input.nextInt();
		
		s=1;
		i=2;
		while(i<=n/2) {			
			if(n%i==0) {
				s+=i;
			}
			i++;
		}
		if(s==n) {
			System.out.println("Broj je savrsen");
		}else {
			System.out.println("Broj nije savrsen");
		}
		
		
		
		
				
	}

}
