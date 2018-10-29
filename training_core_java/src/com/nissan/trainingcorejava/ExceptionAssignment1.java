/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
 class Master{
	 
	 public void perform() {
		 
		 System.out.println(""+30/0);
	 }
	}
public class ExceptionAssignment1 extends Master {

	/**
	 * @param args
	 */
	public void perform(){
		try {
			System.out.println(""+30/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionAssignment1 obj= new ExceptionAssignment1();
		obj.perform();
		

	}

}
