package com.cloudstudio.service.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudstudio.service.springbootapp.model.ProductInfo;
import com.cloudstudio.service.springbootapp.service.ProductService;


@RestController
@RequestMapping(value = "/cart")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/product",method = RequestMethod.GET)
	public ProductInfo getProductDetails(@RequestParam String productId) {
		ProductInfo product=productService.getProductInfo(productId);
		System.out.println(product);
		return product;
	}
	
	@RequestMapping(value = "/product",method = RequestMethod.POST)
	public String saveProductDetails(@RequestBody ProductInfo productInfo) {
		productService.saveProductInfo(productInfo);
		return "Product saved successfully";
	}

}
