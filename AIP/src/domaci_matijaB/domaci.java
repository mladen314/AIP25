package domaci_matijaB;

public class domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		int[]niz = {4, -2, 7, 0, -5, 12, 3, -1};

        int najveci = niz[0];
        int najmanji = niz[0];
        int sumaPoz = 0;
        int brojPoz = 0;
        int parni = 0;

        // prvi prolaz
        for (int i = 0; i < niz.length; i++) {

            if (niz[i] > najveci) {
                najveci = niz[i];
            }

            if (niz[i] < najmanji) {
                najmanji = niz[i];
            }

            if (niz[i] > 0) {
                sumaPoz += niz[i];
                brojPoz++;
            }

            if (niz[i] % 2 == 0) {
                parni++;
            }
        }

        double prosjek = 0;
        if (brojPoz > 0) {
            prosjek = (double) sumaPoz / brojPoz;
        }

        // novi niz bez negativnih
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] >= 0) {
                brojac++;
            }
        }

        int[] noviNiz = new int[brojac];
        int index = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] >= 0) {
                noviNiz[index] = niz[i];
                index++;
            }
        }

        // ispis
        System.out.println("Najveci: " + najveci);
        System.out.println("Najmanji: " + najmanji);
        System.out.println("Prosjek pozitivnih: " + prosjek);
        System.out.println("Parnih ima: " + parni);

        System.out.print("Novi niz: ");
        for (int i = 0; i < noviNiz.length; i++) {
            System.out.print(noviNiz[i] + " ");
        }
    }

		

	}


