/**
 * 
 */
package com.nissan.trainingcorejava;

import java.util.Scanner;

/**
 * @author Rishabh Dev Gupta
 *
 */

class Book{
	String name;
	int count;
	
	public Book(String n, int c)
	{
		this.name=n;
		this.count=c;
	}
}

public class LibrarySystem {
	
	public final int maxCount=5;
	 int bookCount=0;
	private Book bookArr[]=new Book[maxCount];
	Scanner s=new Scanner(System.in);
	
	class Admin{
		
		int pin=12345;
		
		void addBook(Book b)
		{
			bookArr[bookCount]=b;
			bookCount++;
			System.out.println("Successful");
		}
		void removeBook(int index)
		{
			for(int i=index;i<bookCount;i++)
			{
				bookArr[i]=bookArr[i+1];
			}
			bookArr[bookCount]=null;
			bookCount--;
			System.out.println("Successful");
		}
		void updateBook(int index,int count)
		{
			bookArr[index].count=count;
			System.out.println("Successful");
		}
	}
	
	class User{
		
		public void lendBook()
		{
			System.out.println("Select book from below list-");
			int choice=0;
			for(int i=0;i<bookCount;i++)
			{
				System.out.println(i+1+". "+bookArr[i].name+" x "+bookArr[i].count);
			}
			System.out.print("Enter your option-");
			choice=Integer.parseInt(s.nextLine());
			if(choice>0 && choice<=bookCount)
			{
				bookArr[choice-1].count-=1;
				System.out.println("Successful");
			}
			else
			{
				System.out.println("Invalid option.");
			}
		}
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibrarySystem lb= new LibrarySystem();
		Scanner s= new Scanner(System.in);
		do {
			System.out.println("Select your option-");
			System.out.println("1. Admin");
			System.out.println("2. User");
			int option=Integer.parseInt(s.nextLine());
			if(option==1)
			{
				LibrarySystem.Admin ad= lb.new Admin();
				System.out.println("Enter pin-");
				int pin=Integer.parseInt(s.nextLine());
				if(pin==ad.pin)
				{
					System.out.println("Select operation-");
					System.out.println("1. Add");
					if(lb.bookCount>0)
					{
						System.out.println("2. Remove");
						System.out.println("3. Update");
					}
					System.out.print("Enter your option-");
					int operation=Integer.parseInt(s.nextLine());
					if(operation==1)
					{
						try {
						System.out.print("Enter Book Name-");
						String bname=s.nextLine();
						System.out.print("Enter Book count-");
						int bcount=Integer.parseInt(s.nextLine());
						Book b= new Book(bname,bcount);
						ad.addBook(b);
						}
						catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.println("Handled Exception");
							System.out.println(e);
						}
					}
					else if(operation==2)
					{
						System.out.print("Select Book index-");
						int index=1;
						for(int i=0;i<lb.bookCount;i++)
						{
							System.out.println(i+1+". "+lb.bookArr[i].name+" x "+lb.bookArr[i].count);
						}
						System.out.print("Enter book index to delete-");
						index=Integer.parseInt(s.nextLine());
						if(index>0 && index<=lb.bookCount)
						{
							ad.removeBook(index-1);
						}
						else
						{
							System.out.println("Invalid option.");
						}
						
					}
					else if(operation==3)
					{
						System.out.print("Select Book index-");
						int index=1;
						for(int i=0;i<lb.bookCount;i++)
						{
							System.out.println(i+1+". "+lb.bookArr[i].name+" x "+lb.bookArr[i].count);
						}
						System.out.print("Enter book index to delete-");
						index=Integer.parseInt(s.nextLine());
						System.out.print("Enter updated count-");
						int ucount=Integer.parseInt(s.nextLine());
						ad.updateBook(index-1,ucount);
					}
					else
					{
						System.out.println("Invalid Operation selected.");
					}
					
				}
				else
				{
					System.out.println("Incorrect PIN");
				}
				
				
			}
			else if(option==2)
			{
				LibrarySystem.User us= lb.new User();
				us.lendBook();
				
			}
			else
			{
				System.out.println("Invalid Option");
			}
			
		}
		while(true);
	}

}
