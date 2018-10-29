package com.nissan.trainingcorejava;

//Assignment
public class Employeedetails {
	
	int eId;
	int eAge;
	int eSal;
	long eContact;
	String eName;
	String eMail;
	public Employeedetails(int id,int age,int sal,long mob,String name,String email) {
		// TODO Auto-generated constructor stub
		
		this.eId=id;
		this.eAge=age;
		this.eSal=sal;
		this.eContact=mob;
		this.eName=name;
		this.eMail=email;
		System.out.println("Id-"+eId);
		System.out.println("Age-"+eAge);
		System.out.println("Salary-"+eSal);
		System.out.println("MObile No.-"+eContact);
		System.out.println("Name-"+eName);
		System.out.println("Mail Id-"+eMail);
	}
	
	public long addOpr(int age,int sal)
	{
		return age+sal;
	}
	
	public long addOpr(int age,int sal,long mob)
	{
		return age+sal+mob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeedetails obj= new Employeedetails(101, 30, 60000, 9997592808L, "Shyam", "shyam@xyz.com");
		System.out.println(obj.addOpr(obj.eAge,obj.eSal));
		System.out.println(obj.addOpr(obj.eAge,obj.eSal,obj.eContact));
	}

}
