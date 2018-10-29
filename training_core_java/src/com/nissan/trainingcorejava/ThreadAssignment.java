/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Rishabh Dev Gupta
 *
 */
public class ThreadAssignment extends Thread {

	/**
	 * @param args
	 */
	String name;
	public ThreadAssignment(String n)
	{
		this.name=n;
	}
	public void run()
	{
	
			for(int i=0;i<30;i++)
			{
				System.out.println(""+i);
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadAssignment t1= new ThreadAssignment("t1");
		
		ThreadAssignment t2= new ThreadAssignment("t1");
		t1.start();
		t2.start();
		
	}

}
