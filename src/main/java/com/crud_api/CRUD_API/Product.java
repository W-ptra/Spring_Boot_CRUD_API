package com.crud_api.CRUD_API;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
@Scope("prototype")
public class Product {

    private String id;
    private String name;
    private Integer price;
    private String created;

    public void setUUID() {
        this.id = java.util.UUID.randomUUID().toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCreated() {
        this.created = new Date().toString();
    }

    public String getUUID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCreated() {
        return created;
    }
}
