package com.HomeDecor.model;

import java.util.List;

import com.HomeDecor.model.Product;

public interface ProductService {
	
	public List<Product> list();

	public void insert(Product p);

	public void delete(Product pd);

}
