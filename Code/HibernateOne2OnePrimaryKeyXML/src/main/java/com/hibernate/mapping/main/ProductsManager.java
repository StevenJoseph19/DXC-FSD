package com.hibernate.mapping.main;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.mapping.model.Product;
import com.hibernate.mapping.model.ProductDetail;
import com.hibernate.mapping.util.HibernateUtil;

/**
 * This program demonstrates using Hibernate framework to manage a bidirectional
 * one-to-one association on a primary key.
 *
 */
public class ProductsManager {

	public static void main(String[] args) {
		// loads configuration and mappings
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		// creates a new product
		Product product = new Product();
		product.setName("Civic");
		product.setDescription("Comfortable, fuel-saving car");
		product.setPrice(20000);

		// creates product detail
		ProductDetail detail = new ProductDetail();
		detail.setPartNumber("ABCDEFGHIJKL");
		detail.setDimension("2,5m x 1,4m x 1,2m");
		detail.setWeight(1000);
		detail.setManufacturer("Honda Automobile");
		detail.setOrigin("Japan");

		// sets the bi-directional association
		product.setProductDetail(detail);
		detail.setProduct(product);

		// persists the product
		session.save(product);

		// queries all products
		List<Product> listProducts = session.createQuery("from Product").list();
		for (Product aProd : listProducts) {
			String info = "Product: " + aProd.getName() + "\n";
			info += "\tDescription: " + aProd.getDescription() + "\n";
			info += "\tPrice: $" + aProd.getPrice() + "\n";

			ProductDetail aDetail = aProd.getProductDetail();
			info += "\tPart number: " + aDetail.getPartNumber() + "\n";
			info += "\tDimension: " + aDetail.getDimension() + "\n";
			info += "\tWeight: " + aDetail.getWeight() + "\n";
			info += "\tManufacturer: " + aDetail.getManufacturer() + "\n";
			info += "\tOrigin: " + aDetail.getOrigin() + "\n";

			System.out.println(info);
		}

		session.getTransaction().commit();

		//terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}