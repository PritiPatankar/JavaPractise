package com.ltimindtree.osm.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ltimindtree.osm.model.ShoppingCart;

@Service
public class ShoppingCartService {
 
    private final List<ShoppingCart> products = new ArrayList<>();
     
    public List<ShoppingCart> getAllShoppingCartProducts() {
        return products;
    }
    
    public double getTotal() {
        double total=0.0;
        for(ShoppingCart product: products){
            total=total+product.getPrice();
           }
           return total;
    }
    
    public ShoppingCart getProductById(int id) {
        for (ShoppingCart product: products) {
            if (product.getProductId()==id) {
                return product;
            }
        }
        return null;
    }
     
    public boolean deleteProductById(int id) {
        for (ShoppingCart product: products) {
            if(product.getProductId()==id) {
                products.remove(id); return true;
            }
        }
        return false;
    }
     
    public ShoppingCart addProduct(ShoppingCart product) {
        products.add(product);
        return product;
     }
}
    
    
    