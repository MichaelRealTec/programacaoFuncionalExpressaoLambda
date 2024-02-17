package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		// Criei uma lista de produtos
		
		list.add(new Product("TV", 900.00)); // Adicionando o primeiro item
		list.add(new Product("Notebook", 1200.00)); // Adicionando o segundo item
		list.add(new Product("Tablet", 450.00)); // Adicionando o terceiro item
		
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		list.sort(comp); // Ordenando a lista
		
		for (Product p : list) {
			System.out.println(p);
		}
		// Laço de repetição para percorrer toda a lista imprimindo os resultados
		
	}

}
