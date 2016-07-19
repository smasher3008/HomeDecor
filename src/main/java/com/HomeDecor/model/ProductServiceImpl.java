package com.HomeDecor.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO pdao;

	@Transactional
	public void insert(Product p) {
		// TODO Auto-generated method stub
		pdao.insert(p);
	}
    
	@Transactional
	public List<Product> list() {
		// TODO Auto-generated method stub
		return pdao.list();
	}
    
	@Transactional
	public void delete(Product pd) {
		// TODO Auto-generated method stub
		pdao.delete(pd);
	}
	
	

}
