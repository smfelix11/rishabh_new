/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
class Printone
{
	//Synchronized method..
	synchronized void printValue(int a)
	{	int arr[]=new int[4];
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

class Threadthree extends Thread
{
	Printone p;
	Threadthree(Printone p)
	{
		this.p=p;
	}
	
	public void run() {
		p.printValue(5);
	}
}

class Threadfour extends Thread
{
	Printone p;
	Threadfour(Printone p)
	{
		this.p=p;
	}
	
	public void run() {
		p.printValue(100);
	}
}

public class SynchronizedAssg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printone obj= new Printone();
		Threadthree t1= new Threadthree(obj);
		Threadfour t2= new Threadfour(obj);
		t1.start();
		t2.start();
	}

	

}
