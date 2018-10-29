/**
 * 
 */
package com.nissan.trainingcorejava;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Rishabh Dev Gupta
 *
 */

class SuperMarket{
	static int count=0;
	public TreeMap<Integer,Products> productMap=new TreeMap<>();
	public void addProduct(Products p)
	{
		SuperMarket.count++;
		this.productMap.put(count,p);
	}
	
	public void removeProduct(int key)
	{
		this.productMap.remove(key);
	}
	
	public void displayProducts()
	{
		System.out.println("Select from below list-");
		for(Map.Entry m:productMap.entrySet())
		{
			Products p=(Products)m.getValue();
			System.out.println(""+m.getKey()+". "+p.getName());
		}
	}
}

class Products{
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class MapsAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		SuperMarket sp= new SuperMarket();
		FileOutputStream fOut= new FileOutputStream("d:\\output.txt");
		boolean check=true;
		ArrayList<Products> list=new ArrayList<>();
		do {
			System.out.println("Select user type-");
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.print("Enter your option-");
			int user=Integer.parseInt(s.nextLine());
			if(user==1)
			{
				System.out.println("Select operation-");
				System.out.println("1. Add product");
				System.out.println("2. Remove product");
				System.out.println("Enter your option");
				int opr=Integer.parseInt(s.nextLine());
				if(opr==1)
				{
					Products p= new Products();
					sp.displayProducts();
					System.out.println("Enter Product name-");
					p.setName(s.nextLine());
					System.out.println("Enter price-");
					p.setPrice(Integer.parseInt(s.nextLine()));
					sp.addProduct(p);
					System.out.println("Product added successfully");
				}
				else if(opr==2)
				{
					Products p= new Products();
					sp.displayProducts();
					System.out.println("Enter option-");
					sp.removeProduct(Integer.parseInt(s.nextLine()));
					System.out.println("Product deleted");
					
				}
				else
				{
					System.out.println("Invalid option");
				}
			}
			else if(user==2)
			{
				sp.displayProducts();
				System.out.println("Select item to add to cart-");
				int o=Integer.parseInt(s.nextLine());
				list.add(sp.productMap.get(0));
				System.out.println("Product added");
				
			}
			else
			{
				System.out.println("Invalid Option");
			}
			System.out.println("Do you want to continue-");
			String option=s.nextLine();
			if(option.equalsIgnoreCase("yes"))
			{
				
			}
			else
			{
				check=false;
			}
		}
		while(check);
		for(Map.Entry m:sp.productMap.entrySet())
		{
			Products p=(Products)m.getValue();
			String outs=""+m.getKey()+". "+p.getName()+" \n";
			fOut.write(outs.getBytes());
			fOut.write(System.getProperty("line.separator").getBytes());
		}
		fOut.close();

	}

}
