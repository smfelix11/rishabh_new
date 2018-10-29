/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
abstract class Loan{
	
	abstract double rateOfInterest();
}

class ICICI extends Loan{
	
	double rateOfInterest(){
		return 7.8;
	}
}
class HDFC extends Loan{
	double rateOfInterest()
	{
		return 7.1;
	}
}
public class BankImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI i=new ICICI();
		HDFC h=new HDFC();
		System.out.println(i.rateOfInterest());
		System.out.println(h.rateOfInterest());
	}

}
