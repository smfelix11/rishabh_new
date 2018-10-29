/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Arrays;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class ParallelArraySorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,8,3,9,0,1,2,34,56,12,75};
		
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
		
		Arrays.parallelSort(arr);
		System.out.println();
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
	}

}
