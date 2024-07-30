package com.ltimindtree.osm.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ltimindtree.osm.model.Product;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    public List<Product> getAllProducts() {
        return products;
    }
     
    public Product getProductById(int id) {
        for(Product product: products){
            if(product.getProductId()==id) {
                return product;
            }
             
        }
        return null;
    }
     
    public Product updateProductById(int id, Product p) {
        for (Product product: products) {
            if(product.getProductId()==id) {
                product.setPrice(p.getPrice()); 
                product.setProductName(p.getProductName()); 
                product.setQuantityInStock(p.getQuantityInStock());
                return product;
            }
        }
        return null;
    }
     
    public boolean deleteProductById(int id) {
        for (Product product: products) {
            if(product.getProductId()==id) {
                products.remove(id);
                return true;
            }
        }
        return false;
    }
     
    public Product addProduct (Product product) {
        products.add(product);
        return product;
    }
     
}
    
    