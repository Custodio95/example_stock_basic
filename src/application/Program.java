package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product pd = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		pd.name = sc.nextLine();
		System.out.print("Price: ");
		pd.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		pd.qtd = sc.nextInt();
		
		System.out.println("Product data: " + pd.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int qtd = sc.nextInt();
		pd.addProducts(qtd);
		
		System.out.println();
		System.out.println("Updated data: " + pd);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be remove from stock: ");
		qtd = sc.nextInt();
		pd.removeProducts(qtd);
		System.out.println();
		System.out.println("Updated data: " + pd);
		
		sc.close();

	}

}
