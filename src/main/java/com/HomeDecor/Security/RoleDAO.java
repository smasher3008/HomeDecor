package com.HomeDecor.Security;

import java.util.List;

import com.HomeDecor.model.Product;

public interface RoleDAO {
	

	public List<Product> list();
	
	public void insert(Role r);
	
	public void delete(Role rd);
	
	public void generateUserRole(Role r);


}
