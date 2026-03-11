package cas_260304;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> osobe = new ArrayList<>();
		
		osobe.add("Ivan");
		osobe.add("Tijana");
		osobe.add(1, "Matija");
		osobe.add("Cadjo");
		osobe.add("Petar");
		
		System.out.println(osobe.size());
		System.out.println(osobe);
		
		System.out.println(osobe.get(0).toUpperCase());
		osobe.remove(0);
		System.out.println(osobe);
		System.out.println(osobe.get(0));
		osobe.remove("Cadjo");
		System.out.println(osobe);
		System.out.println(osobe.contains("Petar"));
		
		for (String osoba : osobe) {
			System.out.println(osoba);
		}
		
		for (int i = 0; i < osobe.size(); i++) {
			System.out.println(osobe.get(i));
		}
		
		osobe.set(1, "Biga");
		
		System.out.println(osobe);
		
		popuni_listu(osobe);
		System.out.println(osobe);

	}
	
	/*
	 * Napisati program koji unosi imena dok se ne unese KRAJ
	 * Nakon zavrsetka unosa ispisati listu
	 */
	
	public static void popuni_listu(ArrayList <String> osobe) {
		Scanner input = new Scanner(System.in);
		String ime;
		ime = input.nextLine();
		do {
			osobe.add(ime);
			ime = input.nextLine();
		}while(!ime.equalsIgnoreCase("kraj"));
		
		input.close();
	}

}
