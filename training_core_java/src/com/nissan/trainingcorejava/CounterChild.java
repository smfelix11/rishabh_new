/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
class Counter
{
	int count=0;
}
public class CounterChild extends Counter {

	/**
	 * @param args
	 */
	String name[]= {"Rishabh","Rahul","Shubham","Rishabh","Rishabh","Rishabh","Rishabh","Rahul","Shubham","Rahul","Shubham"};
	
	public void updateCount()
	{
		super.count+=1;
	}
	
	public int getCount()
	{
		return super.count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterChild c= new CounterChild();
		for(String n:c.name)
		{
			if(n=="Rishabh")
			{
				c.updateCount();
			}
		}
		System.out.println(c.getCount());
	}

}
