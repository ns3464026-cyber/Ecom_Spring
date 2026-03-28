package com.example.SpringEcom.Service;

import com.example.SpringEcom.Model.Product;
import com.example.SpringEcom.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public boolean existProductId(int id) {
        return repo.existsById(id);
    }
}
