/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Scanner;

/**
 * @author Rishabh Dev Gupta
 *
 */
class Print
{
	//Synchronized method..
	synchronized void printValue(int a)
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(a*i);
			try
			{
				Thread.sleep(500);
//				System.out.println("Input-");
//				Scanner s= new Scanner(System.in);
//				System.out.println(""+s.nextLine());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
	}

class Threadone extends Thread
{
	Print p;
	Threadone(Print p)
	{
		this.p=p;
	}
	
	public void run() {
		p.printValue(5);
	}
}

class Threadtwo extends Thread
{
	Print p;
	Threadtwo(Print p)
	{
		this.p=p;
	}
	
	public void run() {
		p.printValue(100);
	}
}

public class SynchronisedExample {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print obj= new Print();
		Threadone t1= new Threadone(obj);
		Threadtwo t2= new Threadtwo(obj);
		t1.start();
		t2.start();
	}

}
