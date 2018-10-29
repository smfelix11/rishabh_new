/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Arrays;

/**
 * @author Rishabh Dev Gupta
 *
 */

public class InnerClassAssignment {

	/**
	 * @param args
	 */
	
	int arr[]= {2,4,5,3,4,5,6,5,1,9,7};
	
	class ArraySort{
		
		void printLargest(){
			
			Arrays.sort(arr);
			System.out.println(arr[arr.length-1]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassAssignment i= new InnerClassAssignment();
		InnerClassAssignment.ArraySort a= i.new ArraySort();
		a.printLargest();
	}

}
