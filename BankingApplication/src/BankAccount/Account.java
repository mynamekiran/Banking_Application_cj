package BankAccount;

import java.util.Scanner;
import java.time.*;
public class Account {
	
	String customer_name;
	String  Account_no;
	long Balance;
    int Date;
    static Scanner sc;
    
  static
    {
    	sc = new Scanner(System.in);
    }

  void getData()
    {
	
	
	System.out.println("Enter the Customer name:");
	customer_name = sc.next();
	
	System.out.println("Enter the Account number :");
	Account_no = sc.next();
	 
		 
	System.out.println("Enter the Balance :");
	Balance = sc.nextLong();
	 
	 
    }

  
    void display()
    {
    	
    	 
    	System.out.println("Customer name :"+customer_name);
    	
    	LocalDate dt = LocalDate.now();
  	    System.out.println("Opening date : "+dt);
    	 
    	System.out.println("Account number :"+Account_no);
    	
    	System.out.println("Balance :"+Balance);

   }
        	 
    public static void main(String...g)
	{
		Account ob[] = new Account[5];
		
		for(int i=0; i<ob.length; i++)
		{
			ob[i] = new Account();	
			
			ob[i].getData();
			System.out.println("\n");

	        
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			System.out.println("Customer Account information :");
			System.out.println("\n");
			ob[i].display();
	    

		}
     }
  }
	
