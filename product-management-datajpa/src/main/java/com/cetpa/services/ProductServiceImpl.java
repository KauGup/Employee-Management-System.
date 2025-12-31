package com.cetpa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cetpa.models.Product;
import com.cetpa.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService 
{
	private ProductRepository productRepository;
	public ProductServiceImpl(ProductRepository productRepository)
	{
		this.productRepository=productRepository;
	}
	public void saveProduct(Product product) 
	{
		productRepository.save(product);
	}
	public Product getProduct(int pid) 
	{
		return productRepository.findById(pid).orElse(null);
	}
	public void deleteProduct(int pid) 
	{
		productRepository.deleteById(pid);
	}
	public void updateProduct(Product product) 
	{
		productRepository.save(product);
	}
	public List<Product> getProducts() 
	{
		return productRepository.findAll();
	}
}
