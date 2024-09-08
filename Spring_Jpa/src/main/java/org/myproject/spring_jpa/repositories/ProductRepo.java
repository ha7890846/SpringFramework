package org.myproject.spring_jpa.repositories;

import org.myproject.spring_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepo extends JpaRepository<Product, Long> {
}
