/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
interface AdderInterface{
	public void add(int a,int b);
}
public class LambdaAssg2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdderInterface a1=(int a,int b)->{
			System.out.println(a+b);
		};
		
		a1.add(10, 20);
		a1.add(100, 200);
		

	}

}
