package com.nissan.trainingcorejava;

 class E{
	final int a[]= {1,2};
}

public class Staticfinal extends E {
	
	void add()
	{
		super.a[2]=3;//Array out of bound exception
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
