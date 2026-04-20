package cas_260406_OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Osobe a = new Osobe(123456789, "Marko", "Markovic", 2000);
		Osobe b = new Osobe(987654321, "Zarko", "Zarkovic", 2001);
		Osobe c = new Osobe();
		
		System.out.println(c.getIme());
		c.setIme("Anastasija");
		System.out.println(c.getIme());
		
		System.out.println(a.jeStariji(b));
		
		
	}
	

}
