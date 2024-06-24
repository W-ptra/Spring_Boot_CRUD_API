package com.crud_api.CRUD_API;

import com.crud_api.CRUD_API.Repository.ProductRepository;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.util.List;

@SpringBootApplication
public class CrudApiApplication {


	public static <List> void main(String[] args) {

		ConfigurableApplicationContext context =  SpringApplication.run(CrudApiApplication.class, args);
		Product product1 = context.getBean(Product.class);
		product1.setName("Jen");
		product1.setUUID();
		product1.setPrice(9000);
		product1.setCreated();

		ProductRepository repo = context.getBean(ProductRepository.class);

		repo.insert(product1);

		//repo.test(product1);
		//repo.starter();
//		java.util.List<Product> ProductList = repo.findAll();
//
//		for(Product element : ProductList){
//			System.out.println(element.getName());
//			System.out.println(element.getUUID());
//		}
	}
}
