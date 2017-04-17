package net.theironyard.controller;

import net.theironyard.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by doug on 4/17/17.
 */
@Controller
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/")
    public String listProducts(){
        return "productList";
    }

    @GetMapping("/shoppingCart")
    public String showCart(){
        return "shoppingCart";
    }


}
