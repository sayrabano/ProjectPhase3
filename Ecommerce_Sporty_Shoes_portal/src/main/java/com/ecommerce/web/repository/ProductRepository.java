package com.ecommerce.web.repository;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.web.entity.Product;
import com.ecommerce.web.entity.Purchase;


@Repository
@Transactional
public class ProductRepository<product_category> {
	@Autowired
	JdbcTemplate template;
	
	

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}
	
	class ProductRowMapper implements RowMapper<Product>{
		
		
		 @Override
		 public Product mapRow(ResultSet rs, int row) throws SQLException 
			{
				Product product = new Product();
				 product.setProduct_id(rs.getInt(1));
				 product.setGender(rs.getString(2));
				product.setProduct_brand(rs.getString(3));
				 product.setProduct_category(rs.getString(4));
				 product.setProduct_price(rs.getInt(5));
				 product.setProduct_size(rs.getInt(6));
				
				
		
				return  product;
			}
	}
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Product addProduct(Product product) {
		return entityManager.merge(product); 
		
	}
	
	 public void save(Product product) {
			entityManager.merge(product);
		 }
	 
	 public Product findById(int id) {
		 return entityManager.find(Product.class,id);
	 }
	 
	 public void deleteById(String product_id) {
		 int id1 = Integer.parseInt(product_id); 
		 Product product = findById(id1); 
		 entityManager.remove(product); 
	 }
	
		
	
	 
	 public List<Product> findSoccerShoes(){
		 return template.query("select * from product where product_category='Soccer shoes' ", new ProductRowMapper());

			
		 }
	 public List<Product> findRunningShoes(){
		 return template.query("select * from product where product_category='Running shoes' ", new ProductRowMapper());

			
		 }
	 public List<Product> findGolfShoes(){
		 return template.query("select * from product where product_category='Golf shoes' ", new ProductRowMapper());

			
		 }
	 public List<Product> findHighTopShoes(){
		 return template.query("select * from product where product_category='High Top shoes' ", new ProductRowMapper());

			
		 }
	 public List<Product> findHikingBootsShoes(){
		 return template.query("select * from product where product_category='Hiking Boots shoes' ", new ProductRowMapper());

			
		 }

	


}
