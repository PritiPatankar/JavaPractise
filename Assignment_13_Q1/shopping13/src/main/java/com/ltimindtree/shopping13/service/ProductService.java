package com.ltimindtree.shopping13.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.shopping13.entity.Product;
import com.ltimindtree.shopping13.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllproducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long productId){
        return productRepository.findById(productId).orElse(null);
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProductById(Long productId, Product product){
        if(productRepository.findById(productId) != null){
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProductById(Long productId){
        if(productRepository.findById(productId) != null){
            productRepository.deleteById(productId);
        }
    }

    
}
