package com.maveric.bankapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ch;  
		 Scanner sc=new Scanner(System.in);
		 Customer c=new Customer();
	        do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	            
	                switch (ch) {  
	                    case 1:  
	                    	  c.setBankAccounts(null);
	                    	  c.getBankAccounts();
	                    	  
	                        break;  
	                    case 2:  
	                        
	                        break;  
	                    case 3:  
	                       
	                        
	                        break;  
	                    case 4:  
	                    	
	                    	break;  
	                             
	                    case 5:  
	                        System.out.println("See you soon...");  
	                        break;  
	                }  
	            }  
	            while (ch != 5);  
	        }  

	}


