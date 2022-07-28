package com.nashtech.service;

import com.nashtech.model.Product;
import com.nashtech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
