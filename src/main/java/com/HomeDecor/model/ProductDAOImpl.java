package com.HomeDecor.model;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


@Repository @EnableTransactionManagement
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<Product> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
	
	@Transactional
	public void insert(Product p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(p);
	}
	
	@Transactional
	public void delete(Product pd) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(pd);
	}

}
