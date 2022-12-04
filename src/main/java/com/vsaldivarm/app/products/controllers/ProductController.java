package com.vsaldivarm.app.products.controllers;

import com.vsaldivarm.app.products.models.entity.Product;
import com.vsaldivarm.app.products.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/getProducts")
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/getProduct/{id}")
    public  Product detail(@PathVariable Long id){
        return productService.findById(id);
    }

}
