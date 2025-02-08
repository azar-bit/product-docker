package com.sample.learning.product_demo_kube.service;

import com.sample.learning.product_demo_kube.dao.ProductRepo;
import com.sample.learning.product_demo_kube.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;


    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product getProduct(Integer id) {
        return productRepo.findById(id).get();
    }
}
