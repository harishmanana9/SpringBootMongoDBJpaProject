package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Product;
import com.spring.repo.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductRepository productRepo;
	
	@PostMapping
	public Product addNewProduct(@RequestBody Product product) {
		return productRepo.save(product);
	}
	
	@GetMapping("/{no}")
	public Product getProductByNo(@PathVariable("no") Integer no) {
		return productRepo.findByProductNo(no);
	}
	
	@GetMapping
	public Iterable<Product> getAllProducts() {
		return productRepo.findAll();
	}
}
