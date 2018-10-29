/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class StringAssignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> customer= new ArrayList<>();
		Scanner s = new Scanner(System.in);
			System.out.println("Please select option from below menu-");
			System.out.println("1. Add a customer.");
			System.out.println("2. Delete a customer.");
			System.out.println("3. Edit a customer.");
			System.out.println("4. Add customer at specified index.");
			System.out.print("Enter your option-");
			int option=s.nextInt();
			switch(option)
			{
				case 1: System.out.println("Enter customer name-");
						String name=s.next();
						customer.add(name);
						Collections.sort(customer);
						System.out.println(customer);
						break;
				case 2: System.out.println("Enter customer name-");
						String name1=s.nextLine();
						customer.remove(customer.indexOf(name1));
						Collections.sort(customer);
						System.out.println(customer);
						break;
				case 3: System.out.println("Select option from edit menu-");
						System.out.println("1. Edit First Name");
						System.out.println("2. Add Last Name");
						System.out.print("Enter your option-");
						int o=s.nextInt();
						if(o==1)
						{
							System.out.print("Enter previous name-");
							String name2=s.nextLine();
							int index=customer.indexOf(name2);
							if(index!=-1)
							{
							System.out.print("Enter new first name-");
							String fname=s.nextLine();
							String cname=customer.get(index);
							cname.replace(name2, fname);
							}
							else
							{
								System.out.println("Invalid name.");
							}
						}
						else if(o==2) {
							System.out.println("Enter name-");
							String name3=s.nextLine();
							int index=customer.indexOf(name3);
							if(index!=-1)
							{
							System.out.println("Enter last name-");
							String lname=s.nextLine();
							customer.set(index,name3+" "+lname);
							}
							else
							{
								System.out.println("Invalid name.");
							}
						}
						else {
							System.out.println("Invalid option.");
						}
						break;
					
			default: System.out.println("Invalid option");
				
			}

		
		
		

	}

}
