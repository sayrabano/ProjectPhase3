package com.ecommerce.web.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.web.entity.Purchase;

@Repository
public class PurchaseRepository {
	@Autowired
	JdbcTemplate template;
	
	

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}

  public List<Purchase> findAll(){
	
	return template.query("select * from purchase", new RowMapper<Purchase>() 
	{
		public Purchase mapRow(ResultSet rs, int row) throws SQLException 
		{
			Purchase purchase = new Purchase();
					purchase.setProduct_id(rs.getInt(1));
					purchase.setProduct_category(rs.getString(2));
					purchase.setProduct_brand(rs.getString(3));
					purchase.setProduct_price(rs.getInt(4));
					purchase.setProduct_size(rs.getInt(5));
					purchase.setPurchase_date(rs.getDate(6));
			
	
			return purchase;
		}
		});
	
	
	
}
  
  
  
  public List<Purchase> findByFilter(String product_category,Date date){
	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    String NDate= formatter.format(date);
	  
	  
	  return template.query("select * from purchase where product_category='"+product_category+"'"+"and purchase_date='"+NDate+"' ", new RowMapper<Purchase>() {
		  
		  
		  public Purchase mapRow(ResultSet rs, int row) throws SQLException 
			{
				Purchase purchase = new Purchase();
						purchase.setProduct_id(rs.getInt(1));
						purchase.setProduct_category(rs.getString(2));
						purchase.setProduct_brand(rs.getString(3));
						purchase.setProduct_price(rs.getInt(4));
						purchase.setProduct_size(rs.getInt(5));
						purchase.setPurchase_date(rs.getDate(6));
				
		
				return purchase;
			}
			});
	  }
			  
		
	}
	


