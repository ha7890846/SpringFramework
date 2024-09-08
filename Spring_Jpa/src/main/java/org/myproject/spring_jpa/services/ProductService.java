package org.myproject.spring_jpa.services;

import org.myproject.spring_jpa.entities.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product getProduct(long id);
    Product updateProductById(Product product);
    List<Product> getAllProducts();
    void deleteProduct(long id);
}
