package com.HomeDecor.SupplierModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.HomeDecor.SupplierModel.Supplier;
import com.HomeDecor.SupplierModel.SupplierDAO;

public class SupplierServiceImpl implements SupplierService {

	
	@Autowired
	SupplierDAO sdao;

	@Transactional
	public void insert(Supplier s) {
		// TODO Auto-generated method stub
		
		sdao.insert(s);
	}

}
