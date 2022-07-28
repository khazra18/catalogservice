package com.catalogservice.catalogservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogservice.catalogservice.entity.ProductCategoryEntity;
import com.catalogservice.catalogservice.repository.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	
	@Override
	public void insertProduct(ProductCategoryEntity productCategoryEntity) {
		// TODO Auto-generated method stub
		productCategoryRepository.save(productCategoryEntity);
	}

	@Override
	public List<ProductCategoryEntity> getAllProductCategory() {
		// TODO Auto-generated method stub
		return productCategoryRepository.findAll();
	}

	@Override
	public Optional<ProductCategoryEntity> getProductCategoryById(int id) {
		// TODO Auto-generated method stub
		return productCategoryRepository.findById(id);
	}

	@Override
	public void deleteProductCategory(ProductCategoryEntity productCategoryEntity) {
		// TODO Auto-generated method stub
		productCategoryRepository.delete(productCategoryEntity);

	}

}
