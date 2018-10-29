/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
class Print1
{
	//Synchronized method..
	void printValue(int a)
	{	int arr[]=new int[4];
		synchronized(this)
		{
		for(int i=1;i<5;i++)
		{
			arr[i-1]=a*i;
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
		for(int i:arr)
		{
			System.out.println(i);
		}
		}
	}
	}

class Thread1 extends Thread
{
	Print1 p;
	Thread1(Print1 p)
	{
		this.p=p;
	}
	
	public void run() {
		p.printValue(5);
	}
}

class Thread4 extends Thread
{
	Print1 p;
	Thread4(Print1 p)
	{
		this.p=p;
	}
	
	public void run() {
		p.printValue(100);
	}
}

public class SynchronisedAssg2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print1 obj= new Print1();
		Thread1 t1= new Thread1(obj);
		Thread4 t2= new Thread4(obj);
		t1.start();
		t2.start();

	}

}
