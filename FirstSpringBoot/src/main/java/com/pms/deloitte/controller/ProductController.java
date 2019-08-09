package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;

import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	public ProductController() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public String productForm(Model model)
	{	model.addAttribute("product", new Product(1,"monitor", 32,3423));
		return "productform";
		
	}
	

	/*@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}*/
	

	
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public String getProducts(Model model)
	{	model.addAttribute("product", new Product());
		model.addAttribute("listProducts", this.productService.getAllProducts());
		//return productService.getAllProducts();
		return "productform";
		
	}
	
	
	@RequestMapping("/remove/{id}")
    public String removeProduct(@PathVariable("id")Integer productId){
		
        this.productService.deleteProduct(productId);
        return "redirect:/getProducts";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id")Integer productId, Model model){
        model.addAttribute("product", this.productService.getProductById(productId));
        model.addAttribute("listProducts", this.productService.getAllProducts());
        return "productform";
    }
	
	
	
	@RequestMapping("/showProduct")
	public List<Product> showProduct()
	{	return productService.getAllProducts();
		
	}
	
	
	@RequestMapping(value= "/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product :"+p);
			this.productService.addProduct(p);;
		return "redirect:/getProducts";
	}
	
	
	@RequestMapping(value= "/updateProduct", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product p)
	{	System.out.println("#####product :"+p);
		this.productService.updateProduct(p);
		
		return "redirect:/getProducts";
	}
	
	
	@RequestMapping("/saveProduct")
	public String saveProduct(Model model, Product product)
	{	
		//Product product = new Product(11, "Bottle", 1000, 249);
		productService.addProduct(product);
		model.addAttribute("product", new Product());
		model.addAttribute("message", product.getProductName()+" product added");
		return "redirect:/getProducts";
		
	}
	
	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable("pId")Integer productId)
	{	
		productService.deleteProduct(productId);
		return "product deleted with id "+ productId;
		
	}

	@RequestMapping("/getProductId/{pId}")
	public Product getProductId(@PathVariable("pId")Integer productId)
	{	return productService.getProductById(productId);
		
	}

	
	

	@RequestMapping("/getProductName/{pName}")
	public List<Product> updateProduct(@PathVariable("pName")String productName)
	{	return productService.searchByName(productName);
	}
	

	@RequestMapping("/searchProducts/{p1}/{p2}")
	public List<Product> updateProduct(@PathVariable("p1")Integer productPrice, @PathVariable("p2")Integer productPrice2)
	{	
		return productService.searchProducts(productPrice, productPrice2);
	}
}
