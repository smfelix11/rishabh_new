/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
public class StringBufferclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("Nissan");
		System.out.println(sb);
		sb.replace(1, 3, "Rahul");
		System.out.println(sb);
		
		StringBuffer sn= new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sn.capacity());
		

	}

}
