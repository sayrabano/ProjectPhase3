package com.ecommerce.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.web.entity.Product;
import com.ecommerce.web.repository.ProductRepository;




@SpringBootApplication
public class EcommerceSportyShoesPortalApplication implements CommandLineRunner {


	public static void main(String[] args) {
		
		SpringApplication.run(EcommerceSportyShoesPortalApplication.class, args);
	}
	
	//Injecting Dependency------------------>
	@Autowired
	ProductRepository<Product> repo;
	
	
	//inserting product into database---------------------->
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repo.addProduct(new Product(1,"Soccer Shoes","Nike",3000,6,"Male"));
		repo.addProduct(new Product(2,"Soccer Shoes","Adidas",2000,5,"Female"));
		repo.addProduct(new Product(3,"Soccer Shoes","Reebok",3000,7,"Male"));
		
		repo.addProduct(new Product(4,"Running Shoes","Nike",1000,6,"Female"));
		repo.addProduct(new Product(5,"Running Shoes","Adidas",2000,6,"Female"));
		repo.addProduct(new Product(6,"Running Shoes","Reebok",3000,7,"Male"));
		
		repo.addProduct(new Product(7,"Golf Shoes","Nike",2000,6,"Female"));
		repo.addProduct(new Product(8,"Golf Shoes","Puma",2000,4,"Female"));
		repo.addProduct(new Product(9,"Golf Shoes","Reebok",3000,7,"Male"));
		
		
		repo.addProduct(new Product(10,"High Top Shoes","Puma",1000,6,"Female"));
		repo.addProduct(new Product(11,"High Top Shoes","Adidas",1000,4,"Male"));
		repo.addProduct(new Product(12,"High Top Shoes","Red Tap",2500,7,"Male"));
		
		
		repo.addProduct(new Product(13,"Hiking Boots Shoes","Red Tap",1000,4,"Male"));
		repo.addProduct(new Product(14,"Hiking Boots Shoes","Adidas",3000,5,"Female"));
		repo.addProduct(new Product(15,"Hiking Boots Shoes","Reebok",3000,7,"Male"));
	}


}
