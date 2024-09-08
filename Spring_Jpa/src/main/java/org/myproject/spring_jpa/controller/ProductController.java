package org.myproject.spring_jpa.controller;

import lombok.AllArgsConstructor;
import org.myproject.spring_jpa.entities.Product;
import org.myproject.spring_jpa.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("product/api")
public class ProductController {
    private ProductService productService;

//    // http://localhost:8080/api/create/product
    @PostMapping("create/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product product1 = productService.save(product);
        return new ResponseEntity<>(product1,HttpStatus.CREATED);
    }

//    // build get user by id REST API
//    // http://localhost:8080/product/api/getproduct/1
    @GetMapping("/getproduct/{id}")
    public ResponseEntity<Product> getUserById(@PathVariable long id){
        Product product = productService.getProduct(id);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

//     // Update the Existing Product Details
//    // http://localhost:8080/product/api/update/1
    @PutMapping("update/{id}")
    public ResponseEntity<Product> getUpdateById(@PathVariable long id, @RequestBody Product product){
        product.setId(id);
        Product newProduct = productService.updateProductById(product);
        return new ResponseEntity<>(newProduct,HttpStatus.OK);
    }

     // Build Get All products REST API
//    // http://localhost:8080/api/products
    @GetMapping("products")
    public ResponseEntity<List<Product>> getAllUsers(){
        List<Product> productList = productService.getAllProducts();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

//    // http://localhost:8080/api/delete/1
//    // Build Delete User REST API
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long productId){
        productService.deleteProduct(productId);
        return new ResponseEntity<>("Product successfully deleted!", HttpStatus.OK);
    }
}
