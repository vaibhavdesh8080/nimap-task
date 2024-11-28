package org.myventure.in.example.service;

import java.util.List;

import org.myventure.in.example.Model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product createProduct(Product product);
	Product getProduct(Long id);
	Product updateProduct(Long id, Product product);
	void deleteProduct(Long id);
}
