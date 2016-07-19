package com.HomeDecor.Security;

import java.util.List;

public interface RoleService {
	
	public List<Role> list();

	public void insert(Role r);

	public void delete(Role rd);



}
