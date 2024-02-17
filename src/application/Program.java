package application;

import java.util.List;
import java.util.ArrayList;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		// Criei uma lista de produtos
		
		list.add(new Product("TV", 900.00)); // Adicionando o primeiro item
		list.add(new Product("Notebook", 1200.00)); // Adicionando o segundo item
		list.add(new Product("Tablet", 450.00)); // Adicionando o terceiro item
		
		list.sort(arg0);
		

	}

}
