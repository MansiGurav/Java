package com.mastek.productapp;
import com.mastek.productapp.model.Product;
import java.util.Scanner;
public class ProductApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Product[] productlist =new Product[10];
		boolean test=true;
		
		Product product=null;
		int index=0;
		while(test) {
			System.out.println("Enter product id:");
			int pid=Integer.parseInt( sc.nextLine());
			System.out.println("Enter product name:");
		    String pname=sc.nextLine();
		    System.out.println("Enter product price:");
			double price=Double.parseDouble(sc.nextLine());
			product=new Product(pid,pname,price);
			System.out.println("Product Added\n");
			productlist[index]=product;
			index=index+1;
			System.out.println("Do you want to add more product details y/n?");
			String choice=sc.nextLine();
				if(choice.equalsIgnoreCase("n")) {
					test=false;
				}
			}
		sc.close();
		for(int i=0 ; i<productlist.length;i++)
		{
			if(productlist[i]!=null)
			System.out.println(productlist[i]);
		}
	}

}
