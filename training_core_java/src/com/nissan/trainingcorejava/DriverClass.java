/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rishabh Dev Gupta
 *
 */

class Item
{
 String itemName;
 int price;
 String category;
 
public Item(String itemName, int price, String category) {
	super();
	this.itemName = itemName;
	this.price = price;
	this.category = category;
}
 
 
}

class Order
{
	ArrayList<Item> itemList;

	public Order()
	{
		
	}
	public Order(ArrayList<Item> itemList) {
		super();
		this.itemList = itemList;
	}
	
}

public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check=true;
		Scanner s= new Scanner(System.in);
		do {
			System.out.println("Select your option.");
			System.out.println("1.Add Item");
			System.out.println("2. Order");
			System.out.println("2. Update");
			int opt=Integer.parseInt(s.nextLine());
			if(opt==1)
			{
				System.out.println("Enter Item Details-");
				String details=s.nextLine();
				String det[]=details.split(",");
				Item it= new Item(det[0],Integer.parseInt(det[1]),det[2]);
				Order o= new Order();
				o.itemList.add(it);
				System.out.println("Item Successfully Added");
				
			}
			else if(opt==2)
			{
				System.out.println("Select Items from List");
				for(Item i:new Order().itemList)
				{
					System.out.println(""+i.itemName+" "+i.price+" "+i.category);
				}
				System.out.println("Enter your options-");
				String or=s.nextLine();
				
			}
			
			
		}
		while(check);
		

	}

}
