package com.crud_api.CRUD_API.Controller;

import com.crud_api.CRUD_API.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("")
    List<Product> getProductList(){

    }

    @GetMapping("/{id}")
    Product getProductById(@PathVariable Integer id){

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void createProduct(@RequestBody Product product){

    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{id}")
    void updateProduct(@RequestBody Product product){

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteProduct(){

    }

}
