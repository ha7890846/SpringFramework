package org.myproject.spring_jpa.services.impl;

import lombok.Getter;
import lombok.Setter;
import org.myproject.spring_jpa.entities.Product;
import org.myproject.spring_jpa.repositories.ProductRepo;
import org.myproject.spring_jpa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Override
   public Product save(Product product){
        return productRepo.save(product);
    };
    @Override
    public Product getProduct(long id){
        Optional<Product> pro = productRepo.findById(id);
        return pro.get();
    };
    @Override
    public Product updateProductById(Product product){
        Product existingPro = productRepo.findById(product.getId()).get();
        existingPro.setName(product.getName());
        existingPro.setPrice(product.getPrice());
        Product updatedPro = productRepo.save(existingPro);
        return updatedPro;
    }
    @Override
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    };
    @Override
    public void deleteProduct(long id){
        productRepo.deleteById(id);
    };
}
