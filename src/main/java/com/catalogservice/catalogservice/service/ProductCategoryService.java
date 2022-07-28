package com.catalogservice.catalogservice.service;

import java.util.List;
import java.util.Optional;

import com.catalogservice.catalogservice.entity.ProductCategoryEntity;

public interface ProductCategoryService {

	void insertProduct(ProductCategoryEntity productCategoryEntity);
	
	List<ProductCategoryEntity> getAllProductCategory();
	
	Optional<ProductCategoryEntity> getProductCategoryById(int id);
	
	void deleteProductCategory(ProductCategoryEntity productCategoryEntity);
	
}
