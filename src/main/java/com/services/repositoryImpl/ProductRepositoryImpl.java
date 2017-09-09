package com.services.repositoryImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.services.entity.Product;
import com.services.repository.ProductRepository;
import com.services.util.HibernateUtil;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@Override
	public void getProducts() {

		Product p = new Product();
		p.setProductId(1);
		p.setProName("A");
		p.setPrice(10);

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved successfully using annotations.....!!");
		tx.commit();

		List<Product> productList = session.createCriteria(Product.class).list();
		for (Product product : productList) {
			System.out.println(product.toString());
		}

		session.close();
		factory.close();

	}

}
