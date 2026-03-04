package domaci_matijaB;

public class domaci2{ 
	 public static void main(String[] args) {

	        String tekst = "Programiranje123";
	        int brojSamoglasnika = 0;
	        String bezCifara = "";
	        String obrnuti = "";

	        for (int i = 0; i < tekst.length(); i++) {

	            char slovo = tekst.charAt(i);

	            // samoglasnici
	            if (slovo == 'a' || slovo == 'e' || slovo == 'i' ||
	                slovo == 'o' || slovo == 'u' ||
	                slovo == 'A' || slovo == 'E' || slovo == 'I' ||
	                slovo == 'O' || slovo == 'U') {

	                brojSamoglasnika++;
	            }

	            // uklanjanje cifara
	            if (slovo < '0' || slovo > '9') {
	                bezCifara += slovo;
	            }
	        }

	        // okretanje stringa
	        for (int i = tekst.length() - 1; i >= 0; i--) {
	            obrnuti += tekst.charAt(i);
	        }

	        // palindrom bez razmaka
	        String bezRazmaka = tekst.replace(" ", "");
	        String obrnutiBezRazmaka = "";

	        for (int i = bezRazmaka.length() - 1; i >= 0; i--) {
	            obrnutiBezRazmaka += bezRazmaka.charAt(i);
	        }

	        boolean palindrom = bezRazmaka.equals(obrnutiBezRazmaka);

	        // ispis
	        System.out.println("Samoglasnika: " + brojSamoglasnika);
	        System.out.println("Bez cifara: " + bezCifara);
	        System.out.println("Obrnuti: " + obrnuti);
	        System.out.println("Da li je palindrom: " + palindrom);
	    }
	}


