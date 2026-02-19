package com.cloudstudio.service.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloudstudio.service.springbootapp.dao.ProductDAO;
import com.cloudstudio.service.springbootapp.model.ProductInfo;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public ProductInfo getProductInfo(String productId) {
		return productDAO.getProductInfo(productId);
	}
	
	public void saveProductInfo(ProductInfo productInfo) {
		productDAO.saveProductInfo(productInfo);
	}

}
