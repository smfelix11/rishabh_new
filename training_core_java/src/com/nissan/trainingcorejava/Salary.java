/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
class Person
{
	String name;
	double age;
	public Person() {
		// TODO Auto-generated constructor stub
		this.name="Rishabh";
		this.age=21;
	}
}
public class Salary extends Person {

	int salary;
	double discount;
	String name;
	
	public Salary() {
		// TODO Auto-generated constructor stub
		this.name=super.name;
		this.salary=10000;
		this.discount=this.salary*((super.age/100));
		System.out.println(this.name);
		System.out.println(super.age);
		System.out.println(this.salary);
		System.out.println(this.discount);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s=new Salary();
	}

}
