package com.sample.learning.product_demo_kube.dao;

import com.sample.learning.product_demo_kube.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
