/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.StringTokenizer;

/**
 * @author HP
 *
 */
public class StringTokenClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st=new StringTokenizer("my name is nissan"," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		//It has been depricated now
	}

}
