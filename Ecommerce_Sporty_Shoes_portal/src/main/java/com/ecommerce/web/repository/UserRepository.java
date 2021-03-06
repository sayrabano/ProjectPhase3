package com.ecommerce.web.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.ecommerce.web.entity.UserList;

@Repository

public class UserRepository 
{
	@Autowired
	JdbcTemplate template;
	
	

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}

	public List<UserList> findAll()
	{
		return template.query("select * from userlist", new RowMapper<UserList>() 
		{
			public UserList mapRow(ResultSet rs, int row) throws SQLException 
			{
				UserList user = new UserList();
				user.setUser_id(rs.getInt(1));
				user.setUser_name(rs.getString(2));
				user.setUser_email(rs.getString(3));
				user.setUser_location(rs.getString(4));
		
				return user;
			}
			});
		
	}
		public List<UserList> findByEmail(String user_email)
		
		{
			
			return template.query("select * from userlist where user_email ='"+user_email+"'", new RowMapper<UserList>() 
			{
				public UserList mapRow(ResultSet rs, int row) throws SQLException 
				{
					UserList user = new UserList();
					user.setUser_id(rs.getInt(1));
					user.setUser_name(rs.getString(2));
					user.setUser_email(rs.getString(3));
					user.setUser_location(rs.getString(4));
			
					return user;
					
					
				}
				});
		
		
		


	}}
	
