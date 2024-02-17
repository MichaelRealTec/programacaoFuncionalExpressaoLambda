package entities;

public class Product {
	// Atributos
	private String name;
	private Double price;
	
	// Comandos Getters e Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// Método Construtor
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Métodos
	
	@Override
	public String toString() {
		return "Product [name="
				+ getName() +
				", price="
				+ getPrice() +
				"]";
	}
	
	
}
