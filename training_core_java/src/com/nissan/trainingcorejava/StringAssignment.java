/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class StringAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String employeeList[]= {"Rishabh","Rahul","Rishabh","Amrit","Rahul","Jeevesh"};
		Scanner s= new Scanner(System.in);
		for(int i=0;i<employeeList.length;i++)
		{
			for(int j=i+1;j<employeeList.length;j++)
			{
				if(employeeList[i].equalsIgnoreCase(employeeList[j]))
				{
					System.out.println("Enter last name for employee "+employeeList[j]+" at index "+j);
					String lname=s.nextLine();
					employeeList[j]=employeeList[j].concat(" "+lname);
				}
			}
		}
		Arrays.sort(employeeList);
		for(String name:employeeList)
		{
			System.out.println(name);
		}
	}

}
