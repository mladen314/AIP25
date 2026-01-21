package cas_260121;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ime = "Pero";
		String ime2 = "pero";
		String prezime = "Perovic";
		String imePrezime = ime + " " + prezime;
		
		System.out.println(imePrezime);
		System.out.println(imePrezime.length());
		System.out.println(ime==ime2);
		System.out.println(ime.equals(ime2));
		System.out.println(ime.equalsIgnoreCase(ime2));
		System.out.println(ime.toUpperCase());
		System.out.println(ime.toLowerCase());
		System.out.println(ime.charAt(3));
		System.out.println(ime.indexOf("r"));
		System.out.println(prezime.indexOf("Pero"));
		System.out.println(ime.contains("ro"));
		System.out.println(ime.compareTo(prezime)>0);
		System.out.println("Janko".compareTo("Anastasija"));
		ime = ime.replace("o", "a");
		System.out.println(ime);
		
	}

}
