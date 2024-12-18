package performance;

import java.util.Random;

public class AmountCalc {
	
	static double totalC;
	static double gst;
	static double processingFee=0;
	
	public static void calculateTxs(double actualC, boolean i) {
		//Calc Processing
		
		processingFee = actualC*0.0025;
		
		if(processingFee<=30) {
			processingFee=30;
			System.out.println("Processing Fee : "+processingFee);
		}
		
		//If Initial Contri add 200
		if(i) {
			processingFee+=200;
			System.out.println("Inital Contri Charges : 200");
		}
		
		//calc GST on Processing Fee
		gst= processingFee*0.18;
		
		//calc totalC
		totalC= processingFee+gst+actualC;
		
		
	}
	
	public static void main(String[] args) {
		double amt= 500;
		
		calculateTxs(amt, true);
		System.out.println("totalC : "+totalC);
		System.out.println("ActualContriAmt : "+amt);
		System.out.println("gst : "+gst);
		System.out.println("Reg & processingFee : "+processingFee);
	}

}
