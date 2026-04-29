package cas_260422;

public class Student {
	String ime;
	String prezime;
	int[] ocjene;
	int godina_upisa;

	public Student(String ime, String prezime, int[] ocjene, int godina_upisa) {

		this.ime = ime;
		this.prezime = prezime;
		this.ocjene = ocjene;
		this.godina_upisa = godina_upisa;
	}

	public void predstaviSe() {
		System.out.println("Ja sam " + this.ime + " " + this.prezime + " i upisala sam " + this.godina_upisa);
	}

	public String punoIme() {
		String punoIme = this.ime + " " + this.prezime;
		return punoIme;
	}

	public float srednjaOcjena() {
		int suma = 0;
		for (int i : ocjene) {
			suma = suma + i;
		}
		float srednjaOcjena = (float) suma / ocjene.length;
		return srednjaOcjena;
	}

	public boolean imaJedinica() {
		for (int i = 0; i < ocjene.length; i++) {
			if (ocjene[i] == 1) {
				return true;
			}
		}
		return false;
	}

	public String uspjeh() {
		if (this.imaJedinica()) {
			return "Nedovoljan";
		} else if (this.srednjaOcjena() > 5.0) {
			return "Uspjeh ne postoji";
		} else if (this.srednjaOcjena() >= 4.5) {
			return "Odlican";
		} else if (this.srednjaOcjena() >= 3.5) {
			return "Vrlo dobar";
		} else if (this.srednjaOcjena() >= 2.5) {
			return "Dobar";

		} else if (this.srednjaOcjena() >= 2.0) {
			return "Dovoljan";
		} else
			return "Uspjeh ne postoji";
	}

	public int razred() {
		int godina = 2026;
		int razred = godina - this.godina_upisa;
		return razred;

	}

	public boolean samBolji(Student ucenik) {
		if (this.srednjaOcjena() > ucenik.srednjaOcjena()) {
			return true;
		}
		return false;
	}

	/*
	 * --------------------------------------------------------------
	 */
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int[] getOcjene() {
		return ocjene;
	}

	public void setOcjene(int[] ocjene) {
		this.ocjene = ocjene;
	}

	public int getGodina_upisa() {
		return godina_upisa;
	}

	public void setGodina_upisa(int godina_upisa) {
		this.godina_upisa = godina_upisa;
	}

}
