package com.pms.deloitte.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pms.deloitte.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {

		public List<Product> findByProductName(String productName);
		public List<Product> findByPriceBetween(int min, int max);
		/* We have to write method names like this only.. start with 'findBy' then property name, 
		 * first letter capitalized, then keyword, for ex- here 'Between is a keyword */
		//search in google jpa keywords
		
	
}
