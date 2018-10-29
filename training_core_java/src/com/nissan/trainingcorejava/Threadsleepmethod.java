/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class Threadsleepmethod extends Thread {

	/**
	 * @param args
	 */
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try {
				Thread.sleep(500);
				System.out.println("Executing");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadsleepmethod t1= new Threadsleepmethod();
		Threadsleepmethod t2= new Threadsleepmethod();
		t1.start();
		t2.start();
	}

}
