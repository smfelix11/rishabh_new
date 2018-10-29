/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
public class WrapperExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object to primitive
		Integer a=new Integer(3);
		int i= a.intValue();
		int j=a;//unboxing
		
		//Primitive to object
		
		Integer k=j;// Auto-boxing
		Integer l=Integer.valueOf(j);//Boxing
		
	}

}
