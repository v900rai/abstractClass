package edu.jaspiders.heca48.abstrack;
import java.util.Scanner;
public class MainOfClass
{
	public static void main(String[]args)
	{
		Operation o=new Operation();
		 Scanner sc=new Scanner(System.in);
		 while(true)
		 {
			 System.out.println("1.Lenevo\n2.Hp\n3.DEll");
			 System.out.println("Please Select your Laptop");
			 int choice=sc.nextInt();
			 System.out.println();
			 switch(choice)
			 {
			 case 1: o.getDetails("Lenovo");
			         break;
			 case 2: o.getDetails("Dell");
	                  break;
			 case 3: o.getDetails("HP");
	         break;
			 
			 default : System.exit(0);
			 
			 
			 }
			 
		 }
		 
		
	}

}

