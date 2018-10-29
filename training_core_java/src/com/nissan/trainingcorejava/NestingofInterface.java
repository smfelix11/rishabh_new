package com.nissan.trainingcorejava;

interface Writable{
	default void  write()
	{
		System.out.println("write");
	}
	interface Readable{
		void read();
	}
}

public class NestingofInterface implements Writable,Writable.Readable {

	public void read()
	{
		System.out.println("read");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writable i= new NestingofInterface();
		Writable.Readable k= new NestingofInterface();
		i.write();
		k.read();
	}

}
