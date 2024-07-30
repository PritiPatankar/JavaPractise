package com.ltimindtree.shopping13.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.shopping13.entity.ShoppingCart;
import com.ltimindtree.shopping13.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCart> getAllCartProducts(){
        return shoppingCartRepository.findAll();
    }

    public ShoppingCart getCartProductById(Long productId){
        return shoppingCartRepository.findById(productId).orElse(null);
    }

    public ShoppingCart addProductInCart(ShoppingCart shoppingCart){
        return shoppingCartRepository.save(shoppingCart);
    }
    // public ShoppingCart updateShoppingCart(Long productId, ShoppingCart shoppingCart){
    //     if(shoppingCartRepository.findById(productId) != null){
    //         return shoppingCartRepository.save(shoppingCart);
    //     }
    //     return null;
    // }

    public void deleteShoppingCartProduct(Long productId){
        if(shoppingCartRepository.findById(productId) != null){
            shoppingCartRepository.deleteById(productId);
        }
    }


    
}
