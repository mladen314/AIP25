package cas_251103;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x=5,y=10;
		char a = 'm';
		
		boolean t = true; // false
		
		t = x==y; // <,  <=,   >,   >=,   ==
		
		t = x>0 && x<y; //   && - logicko I (AND)   || -  logicko ILI (OR)
		t = x<5 || x>10; // 
		
		/*
		 * Stampa da li skola radi ako znamo da je pauza izmedju
		 * 11h i 14h 
		 */
		
		System.out.println("Unijeti vrijeme");
		x=input.nextInt();
		t = (x>8&&x<11)||(x>14&&x<20);
		System.out.println("Skola radi: "+t);
		

	}

}
