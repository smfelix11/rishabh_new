/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
//Overriding 
class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running....");
	}
}
class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running....");
	}
}
public class Overridingmethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bike bike=new Bike();
	bike.run();
	}

}
