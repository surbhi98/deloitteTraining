package com.pms.deloitte.service;

import java.util.List;

import com.pms.deloitte.model.Product;

public interface ProductService {

	public void addProduct(Product product);
	public void updateProduct(Product product);
	public List<Product> getAllProducts();
	public void deleteProduct(int productId);
	public Product getProductById(int productId);
	public List<Product> searchByName(String productName);
	public List<Product> searchProducts(int price, int price1);
	
	

}
