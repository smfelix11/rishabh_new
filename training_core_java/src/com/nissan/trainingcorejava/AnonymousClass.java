package com.nissan.trainingcorejava;

abstract class Customer
{
	abstract void name();
	
}

interface Cust{
	void name();
}

abstract class AnonymousMaster
{
	abstract void add();
}
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer(){
			void name()
			{
				System.out.println("The name is Shyaam");
			}
		};
		c.name();
		Cust c1 = new Cust()
		{
			public void name()
			{
				System.out.println("The name is Mahesh");
			}
		};
		c1.name();

	}

}
