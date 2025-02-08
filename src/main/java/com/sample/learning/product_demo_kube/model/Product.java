package com.sample.learning.product_demo_kube.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer product_id;
    private String product_name;
    private int product_Quantity;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_Quantity() {
        return product_Quantity;
    }

    public void setProduct_Quantity(int product_Quantity) {
        this.product_Quantity = product_Quantity;
    }
}
