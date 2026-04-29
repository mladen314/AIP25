package cas_260422;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		Student Jana = new Student("Jana", "Janic", new int[]{5,5,4,4,3,3,4,5}, 2006);
		Student Marko = new Student ("Marko","Markovic", new int[] {3,3,3,3,3,3,3,3}, 2011);
		
		Jana.predstaviSe();
		
		System.out.println(Jana.punoIme());
		
		System.out.println("Srednja ocjena je: " + Jana.srednjaOcjena());
		
		System.out.println("Ima jedinica?: " + Jana.imaJedinica());
		
		System.out.println(Jana.uspjeh());
		
		System.out.println(Jana.razred()+". razred");
		
		System.out.println("Bolji: "+ Jana.samBolji(Marko));

	}

}
