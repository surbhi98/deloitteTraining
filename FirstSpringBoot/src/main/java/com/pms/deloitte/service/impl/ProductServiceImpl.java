package com.pms.deloitte.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO productDAO;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addProduct(Product product) {
	
		productDAO.save(product);

	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDAO.save(product);
		
	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Product>)productDAO.findAll();
		
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		productDAO.deleteById(productId);

	}

	@Override
	@Transactional
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Optional<Product>product = productDAO.findById(productId);
		if(product.isPresent()) return product.get();
		else return null;
	}

	@Override
	public List<Product> searchByName(String productName) {
		// TODO Auto-generated method stub
		return productDAO.findByProductName(productName);
		
	}

	@Override
	public List<Product> searchProducts(int price, int price1) {
		// TODO Auto-generated method stub
		return productDAO.findByPriceBetween(price,price1);
		//return null;
	}

}
