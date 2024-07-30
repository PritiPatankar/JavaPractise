package com.ltimindtree.osm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ltimindtree.osm.model.Product;
import com.ltimindtree.osm.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product p=productService.getProductById(id);
        if(p==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(p);
    }
    
    @PostMapping
    public ResponseEntity<Product> addProduct (@RequestBody Product product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct (@PathVariable int id, @RequestBody Product entity) {
        Product p = productService.updateProductById(id,entity);
        return ResponseEntity.ok(p);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteProduct(@PathVariable int id) { return ResponseEntity.ok(productService.deleteProductById(id));
    }
}