package rekurzije_ivanR;


public class Main {

	public static void main(String[] args) {
		
		System.out.println(faktorijel(5));//zapisuje faktorijel datog broja
		System.out.println(Euklid(24,18));//NZD euklidov algoritam
		System.out.println(Fibonaci(6));//Zapisuje najveci element fibonacijevog niza
		System.out.println(sumaCifara(12345));//sumaCifara datog broja
	}
	public static int faktorijel(int n) {
		if(n>0) {
			return n*faktorijel(n-1);
		}else {
			return 1;
		}
	}
	public static int Euklid(int a, int b) {
		if(a%b==0) {
			return b;
		}else {
			return a%b;
		}
	}
	public static int Fibonaci(int n){
		
		if(n>2) {
			
			return Fibonaci(n-1) + Fibonaci(n-2);
			
		}else if(n == 1 && n == 2) {
			return 1;
		}
		return 1;
	}
	
	///netacno
	public static int sumaCifara(int s) {
		
		if(s>=0) {
		return sumaCifara(s%10) + sumaCifara((s%10)/10);
	}else {
		return 0;
	}
		
		
		
		
		
		
		
		
}

}