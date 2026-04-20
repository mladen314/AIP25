package cas_260406_OOP;

public class Osobe {
	private long jmbg;
	private String ime;
	private String prezime;
	private int godine_rodjenja;
	
	public Osobe(long jmbg, String ime, String prezime, int godine_rodjenja) {
		this.jmbg = jmbg;
		this.ime = ime;
		this.prezime = prezime;
		this.godine_rodjenja = godine_rodjenja;
		this.info();
	}
	
	public Osobe(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		this.info();
	}
	
	public Osobe(){
		this.jmbg = 1111111111;
		this.ime = "Ana";
		this.prezime = "Petrovic";
		this.godine_rodjenja = 2001;
		this.info();
	}
	

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void info() {
		System.out.println("****************************************");
		System.out.println("Ova osoba je:");
		System.out.println(this.ime + " " + this.prezime);
		System.out.println("I rodjen/a je "+ this.godine_rodjenja+". godine.");
		System.out.println("****************************************");
		
	}
	
	/*
	 * Napisati metodu koja provjerava da li je objekat stariji od
	 * drugog objekta sa kojim se uporedjuje
	 */
	
	public boolean jeStariji(Osobe x) {
		if(this.godine_rodjenja<x.godine_rodjenja) {
			return true;
		}
		
		return false;
	}
	
	
}
