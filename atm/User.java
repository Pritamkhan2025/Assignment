package com.atm;

//@Author pritam khan

import java.util.Scanner;

public class User {
	private long accno;//taking variables
	private double balance;
	
	Scanner sc = new Scanner(System.in);  //scanner class
	
	public void createAcc() {//create account
	        
	System.out.print("Enter Account No: ");  
        accno = sc.nextLong();   
         
        System.out.print("Enter Balance: ");  
        balance = sc.nextDouble();
	}

	
	public void depositBalance() {  //deposit balance
        double amount;  
        System.out.print("Enter Account No: ");  
        accno = sc.nextLong();
        
        System.out.println("Enter deposit amount: ");  
        amount = sc.nextDouble();  
        
        balance = balance + amount;  
    }
	
	public void withdrawBalance() {  // withdraw Balance
	double amount;  
	System.out.print("Enter Account No: ");  
        accno = sc.nextLong();
        
        System.out.println("Enter withdraw amount: ");  
        amount = sc.nextDouble();  
        
        if (balance >= amount) {  //condition statement
            balance = balance - amount;  
            System.out.println("Withdraw sucessfull and Remaining Balance is: "+balance);  
        } 
        else {  
            System.out.println("Insuficient Balance" );  
        }  
    }
	
	public void viewBalance() { // show balance
		
	System.out.print("Enter Account No: ");  
        accno = sc.nextLong();
        
        System.out.println("Available Balance: "+balance);
		
	}


	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}


	

	

}
