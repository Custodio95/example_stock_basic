package application;

import java.util.Scanner;

import entities.Product;

// basic stock example
public class Program {

	public static void main(String[] args) {
		
		//instance objects
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		
		// First input data
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		pd.name = sc.nextLine(); 
		System.out.print("Price: ");
		pd.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		pd.qtd = sc.nextInt();
		
		//show in screen
		System.out.println("Product data: " + pd.toString());
		
		// Function add in stock
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int qtd = sc.nextInt();
		pd.addProducts(qtd);
		
		//show in screen
		System.out.println();
		System.out.println("Updated data: " + pd);
		
		//Remove from stock function
		System.out.println();
		System.out.println("Enter the number of products to be remove from stock: ");
		qtd = sc.nextInt();
		pd.removeProducts(qtd);
		
		//show in screen
		System.out.println();
		System.out.println("Updated data: " + pd);
		
		sc.close();

	}

}
