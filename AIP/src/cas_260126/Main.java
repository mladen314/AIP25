package cas_260126;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	/*
	 * Funkcija koja izvrsava izraz koji je dat u obliku stringa
	 * 
	 */
	
	public static float izraz(String s) {
		
		int op;
		int plus = s.indexOf("+");
		int minus = s.indexOf("-");
		int puta = s.indexOf("*");
		int podjeljeno = s.indexOf("/");
		
		op = plus+minus+puta+podjeljeno+3;
		
		int prvi = Integer.parseInt(s.substring(0,op));
		int drugi = Integer.parseInt(s.substring(op+1)); 
		
	}

}
