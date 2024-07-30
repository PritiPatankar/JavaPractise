package com.ltimindtree.osm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ltimindtree.osm.model.ShoppingCart;
import com.ltimindtree.osm.service.ShoppingCartService;

@RestController 
@RequestMapping("/shopping")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;
    
    @GetMapping
    public ResponseEntity<List<ShoppingCart>> getAllShoppingCartProducts() {
        return ResponseEntity.ok(shoppingCartService.getAllShoppingCartProducts());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ShoppingCart> getProductById(@PathVariable int id) {
        ShoppingCart p=shoppingCartService.getProductById(id);
        if(p==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(p);
    }
    
    @PostMapping
    public ResponseEntity <ShoppingCart> addProduct (@RequestBody ShoppingCart product) {
        return ResponseEntity.ok(shoppingCartService.addProduct (product));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteProduct (@PathVariable int id) {
        return ResponseEntity.ok(shoppingCartService.deleteProductById(id));
    }
}
