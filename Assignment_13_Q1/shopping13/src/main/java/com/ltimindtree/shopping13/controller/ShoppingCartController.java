package com.ltimindtree.shopping13.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.shopping13.entity.ShoppingCart;
import com.ltimindtree.shopping13.service.ShoppingCartService;

@RestController
@RequestMapping("/{shopping}")
public class ShoppingCartController {
    
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping
    public ResponseEntity<List<ShoppingCart>> getAllCartProducts(){
        return new ResponseEntity<>(shoppingCartService.getAllCartProducts(), HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ShoppingCart> getCartProductById(@PathVariable Long productId){
        return new ResponseEntity<>(shoppingCartService.getCartProductById(productId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ShoppingCart> addProductInCart(@RequestBody ShoppingCart shoppingCart){
        return new ResponseEntity<>(shoppingCartService.addProductInCart(shoppingCart),HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteShoppingCartProduct(@PathVariable Long productId){
        shoppingCartService.deleteShoppingCartProduct(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
