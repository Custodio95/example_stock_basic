package entities;

public class Product {

	public String name;
	public double price;
	public int qtd;
	
	// function to calculate total value.
	public double totalValueInStock() {
		return price *qtd;
		
	}
	// function to add Products
	public void addProducts(int qtd) {
		this.qtd +=qtd;
	}
	
	// function to remove Products
	public void removeProducts(int qtd) {
		this.qtd -=qtd;
	}
	
	// custom toString
	public String toString() {
		return name
				+" , $ "
				+ String.format("%.2f", price)
				+", "
				+qtd
				+" units, Total: $ "
				+String.format("%.2f", totalValueInStock());
		
	}
	
}
