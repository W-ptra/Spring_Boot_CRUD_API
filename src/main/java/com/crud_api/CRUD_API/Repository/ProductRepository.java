package com.crud_api.CRUD_API.Repository;

import jakarta.annotation.PostConstruct;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    private final JdbcClient jdbcClient;

    public ProductRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

}
