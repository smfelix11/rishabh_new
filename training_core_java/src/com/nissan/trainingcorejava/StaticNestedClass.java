package com.nissan.trainingcorejava;

public class StaticNestedClass {
	
	static int memberonevalue= 100;
	static class Innerone{
		void displaymember()
		{
			System.out.println("Value is-"+memberonevalue);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For static nested class
		StaticNestedClass.Innerone n= new StaticNestedClass.Innerone();
		n.displaymember();
		
	}

}
