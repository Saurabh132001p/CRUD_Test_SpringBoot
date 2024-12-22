package com.CRUDTEST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CRUDTEST.dto.Category;
import com.CRUDTEST.dto.Product;
import com.CRUDTEST.service.ProductService;


@RestController
@RequestMapping("/Product")
public class ProductController {
	  
	
	@Autowired
	ProductService service;
	
	@PostMapping("/save")
	public void saveProduct(@RequestBody Product pro)
	{
		service.saveProducts(pro);
	}
	
	@GetMapping("/read")
	public List<Product> readAll()
	{
		return service.readAll();
		
	}
	
	@PatchMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product pro,@RequestParam int id)
	{
		return service.updateProduct(id, pro);
	}
	
	@PatchMapping("/updateCategory")
	public Category updateCategory(@RequestBody Category cat,@RequestParam int id)
	{
		return service.updateCategory(id, cat);
	}
	
	@DeleteMapping("/deletecategory")
	public void deleteCategory(@RequestParam int id)
	{
		service.deleteCategory(id);
	}
	
	@DeleteMapping("/deleteproduct")
	public void deleteProduct(@RequestParam int id)
	{
		service.deleteProduct(id);
	}
	

}
