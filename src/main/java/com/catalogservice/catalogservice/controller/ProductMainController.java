package com.catalogservice.catalogservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogservice.catalogservice.entity.ProductCategoryEntity;
import com.catalogservice.catalogservice.service.ProductCategoryServiceImpl;

@RestController
@RequestMapping(path = {"/api/v1/product"},produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductMainController {

	@Autowired
	private ProductCategoryServiceImpl productCategoryServiceImpl;
	
	@GetMapping(path = {"/getAllProdcutCategory"})
	ResponseEntity<List<ProductCategoryEntity>> getAllProductCategory(){
		return ResponseEntity.status(HttpStatus.OK).body(productCategoryServiceImpl.getAllProductCategory());
	}
	
	@GetMapping(path = {"/getProductCategory/{id}"})
	ResponseEntity<ProductCategoryEntity> getProductCategoryById(@PathVariable int id) {
		Optional<ProductCategoryEntity> productCategoryById = productCategoryServiceImpl.getProductCategoryById(id);
		if(productCategoryById.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(productCategoryById.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	
}
