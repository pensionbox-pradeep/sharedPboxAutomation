package performance;

import java.util.Random;

public class GenreratePercentage {

	public static void main(String[] args) {
		int eq;
		int al;
		int gb;
		int cb;
		int total =100;
		
		Random r= new  Random();
		eq=r.nextInt(75);
		
		int rem1= 100-eq;
		
		al=r.nextInt(5);
		
		int rem2=rem1-al;
		
		gb=r.nextInt(5);
		
		
		int rem3=rem2-gb;
		
		cb=rem3;
		System.out.println(cb+ "Corp Bonds");
		
		System.out.println(eq+ " Equity");
		System.out.println(al+ " Alt Bonds");
		System.out.println(gb+ " Gov Bond");
		System.out.println(cb+ " Corp Bond");
		
		int sum=eq+al+gb+cb;
		System.out.println("Sum = "+ sum);
		
		
		
		
		
		
	}

}
