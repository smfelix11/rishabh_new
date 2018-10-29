/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
interface Printdisplay1{
	public void display();
}
public class LambdaExpressionAssg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="Rahul";
		Printdisplay1 p1=()->{
			System.out.println("Print value-"+value);
		};
		Printdisplay1 p2=()->{
			System.out.println("Print value--"+value);
		};
		p1.display();
		p2.display();

	}

}
