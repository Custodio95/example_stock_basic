package entities;

public class Product {

	public String name;
	public double price;
	public int qtd;
	
	public double totalValueInStock() {
		return price *qtd;
		
	}
	
	public void addProducts(int qtd) {
		this.qtd +=qtd;
	}
	
	public void removeProducts(int qtd) {
		this.qtd -=qtd;
	}
	
	
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
