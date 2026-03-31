package com.example.SpringEcom.controller;

import com.example.SpringEcom.Model.Product;
import com.example.SpringEcom.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController{
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK) ;
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        Product product = service.getProductById(id);
        if(service.existProductId(id)) {
            return product;
        }
        else{
            return new Product();
        }
    }
//    @GetMapping("product/{productid}/image")
//    public ResponseEntity<byte[]> getProductImage(@PathVariable int productId){
//        Product product= service.getProductById(productId);
//        return new ResponseEntity<>(product.getImageData(),HttpStatus.OK);
//
//    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product , @RequestPart MultipartFile image){
        Product savedProduct = null;
        try {
            savedProduct = service.addOrUpdateProduct(product,image);
            return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id , @RequestPart Product product,@RequestPart MultipartFile image){
        Product updatedProduct = null;
        try {
            updatedProduct = service.addOrUpdateProduct(product,image);
            return new ResponseEntity<>("updated",HttpStatus.ACCEPTED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id ){
        Product product = service.getProductById(id);
        if(product!=null) {
            service.deleteProduct(id);
            return new ResponseEntity<>("DELETED", HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/product/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){
        List<Product> products = service.searchProducts(keyword);
        System.out.println("SEARCHING WITH " + keyword );
        return new ResponseEntity<>(products,HttpStatus.OK);

    }


}
