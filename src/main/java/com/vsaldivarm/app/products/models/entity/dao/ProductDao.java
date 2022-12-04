package com.vsaldivarm.app.products.models.entity.dao;

import com.vsaldivarm.app.products.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Long> {

}
