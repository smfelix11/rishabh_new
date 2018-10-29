/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author HP
 *
 */
//Assg-2
 class Employee
 {
	 int eId;
	 int eSal;
	 int eAge;
	 String eName;
	 
	 public void setValues(int id,int age, int sal,String name) {
		 this.eId=id;
		 this.eSal=sal;
		 this.eAge=age;
		 this.eName=name;
		 System.out.println(this.eId);
		 System.out.println(this.eName);
		 System.out.println(this.eAge);
		 System.out.println(this.eSal);
	 }
 }
 
public class HREmp extends Employee {

	/**
	 * @param args
	 */
	public void setValues(int id,int age, int sal,String name) {
		 this.eId=id;
		 this.eSal=sal;
		 this.eAge=age;
		 this.eName=name;
		 System.out.println("SET IN CHILD---------");
		 System.out.println(this.eId);
		 System.out.println(this.eName);
		 System.out.println(this.eAge);
		 System.out.println(this.eSal);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HREmp emp= new HREmp();
		emp.setValues(101, 44, 10000,"Shyam");
	}

}
