package com.HomeDecor.model;

import java.util.List;

public interface ProductDAO {

	public List<Product> list();
	
	public void insert(Product p);
	
	public void delete(Product pd);
}
