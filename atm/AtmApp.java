package com.atm;

//@Author pritam khan
import java.util.Scanner;

public class AtmApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

			User u=new User();
			Scanner sc=new Scanner(System.in);
			int ch;
			do {
				System.out.println("1. createAcc \n2. depositBalance \n3. withdrawBalance  \n4. viewBalance \n5. EXIT");
				System.out.println("Enter your choice from 1 to 5");
				ch=Integer.parseInt(sc.nextLine());
				System.out.println("---------------------");
				switch(ch) {
				case 1:
					u.createAcc();
					break;
				case 2:
					u.depositBalance();
					break;
				case 3:
					u.withdrawBalance();
					break;
					
				case 4:
					u.viewBalance();
					break;
		
				case 5:
					System.exit(0);;
					break;	
				}
				
			}while (ch!=5);
			
		}


	}

