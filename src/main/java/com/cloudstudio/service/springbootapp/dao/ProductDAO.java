package com.cloudstudio.service.springbootapp.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.cloudstudio.service.springbootapp.model.ProductInfo;

@Component
public class ProductDAO {

	private Map<String, ProductInfo> productMap = new HashMap<String, ProductInfo>();

	public ProductInfo getProductInfo(String productId) {
		return productMap.get(productId);
	}
	
	public void saveProductInfo(ProductInfo productInfo) {
	productMap.put(productInfo.getProductId(), productInfo);
	}

}
