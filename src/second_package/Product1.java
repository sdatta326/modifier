package second_package;

import java.util.*;


public class Product1 {
        
		private static int code;
		private static String name;
		private static Double price;
		private static String cat;
		private static int prodcounter=100;
		              
		public Product1(String n,double p, String c) 
		{             
			name = n;
			price = p;
			cat = c; //this keyword ref to class member             this.address = address;      
			code= ++prodcounter; //why final is permitted?
		} 
		
		public Product1(String n,double p) 
		{             
			name = n;
			price = p;      
			code= ++prodcounter; //why final is permitted?
			
		} 
		
		public static void getProductDetails() 
		{             
			System.out.println("Code: " + code+" "+"Name: " + name+" "+"Price: " + price+" "+"Category:"+ cat);             
			
		} 
		           
	public static void main(String[] args) 
	{    
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the product details....");
		name=sc.next();
		price=sc.nextDouble();
		sc.nextLine();
		cat=sc.nextLine();
		Product1 obj = new Product1(name, price,cat); 
		obj.getProductDetails(); 
		Product1 obj1 = new Product1(name, price);
		obj1.getProductDetails(); 
	}

	}
