/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Rishabh Dev Gupta
 *
 */

class StringSort
{
	public void reverseSort()
	{
		System.out.println("Sorting");
	}
}
public class AnonymousClassAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Rishabh","Shubham","Amrit","Zeeshan"};
		
		StringSort s= new StringSort() {
			public void reverseSort()
			{
				Arrays.sort(arr,Collections.reverseOrder());
				for(String a:arr)
				{
					System.out.println(a);
				}
			}
		};
		
		s.reverseSort();

	}

}
