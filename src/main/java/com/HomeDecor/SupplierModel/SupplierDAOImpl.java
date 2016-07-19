package com.HomeDecor.SupplierModel;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HomeDecor.SupplierModel.Supplier;

@Repository
public class SupplierDAOImpl {


	@Autowired
	private SessionFactory sessionfactory;

	public void insert(Supplier s) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(s);
		
	}
	
	
}
