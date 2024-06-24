package com.crud_api.CRUD_API.Repository;

import com.crud_api.CRUD_API.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepository {
    private final JdbcClient jdbcClient;

    @Autowired
    public ProductRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    public void test(Product product){
        System.out.println(product.getName());
    }

    public List<Product> findAll(){
        return jdbcClient.sql("SELECT * FROM Product").query(Product.class).list();
    }

    public void insert(Product product){
        String sql = "INSERT INTO Product (id, name, price, created) VALUES (?, ?, ?, ?)";
        jdbcClient.sql(sql)
                .param(product.getUUID())
                .param(product.getName())
                .param(product.getPrice())
                .param(product.getCreated())
                .update();

        System.out.println("Inserted Sucessfully");
    }
}
