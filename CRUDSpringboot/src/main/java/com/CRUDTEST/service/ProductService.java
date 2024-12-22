package com.CRUDTEST.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUDTEST.dto.Category;
import com.CRUDTEST.dto.Product;
import com.CRUDTEST.repository.CategoryRepo;
import com.CRUDTEST.repository.productRepo;


@Service
public class ProductService {
	
	@Autowired
	productRepo proRepo;
	
	@Autowired
	CategoryRepo catRepo;
	
	public void saveProducts(Product pro)
	{
		int id=pro.getCategory().getId();
	Optional<Category> op=catRepo.findById(id);
	if(op.isPresent())
	{
		pro.setCategory(op.get());
		proRepo.save(pro);
	}
	else {
		proRepo.save(pro);
	}
	}
	
	public List<Product> readAll()
	{
		List<Product> li=proRepo.findAll();
		return li;
	}
	
	public Product updateProduct(int id,Product pro) {
	
		Optional<Product> op=proRepo.findById(id);
		if(op.isPresent())
		{
			pro.setId(id);
			pro.setCategory(op.get().getCategory());
			return proRepo.save(pro);
		}
		return null;
	}
	
	
	public Category updateCategory(int id,Category cat)
	{
		
		Optional<Category> op=catRepo.findById(id);
		if(op.isPresent())
		{
			cat.setId(id);
			return catRepo.save(cat);
		}
			
		return null;
	}
	
	public void deleteCategory(int id)
	{
		Optional<Category> op=catRepo.findById(id);
		if(op.isPresent())
		{
			catRepo.deleteById(id);
			op.get();
		}
	}
	
	public void deleteProduct(int id)
	{
		Optional<Product> op=proRepo.findById(id);
		if(op.isPresent())
		{
			proRepo.deleteById(id);
			op.get();
		}
	}
	
	
	
//	
}
