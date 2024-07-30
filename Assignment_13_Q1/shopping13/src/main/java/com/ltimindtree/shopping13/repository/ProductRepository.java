package com.ltimindtree.shopping13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltimindtree.shopping13.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
