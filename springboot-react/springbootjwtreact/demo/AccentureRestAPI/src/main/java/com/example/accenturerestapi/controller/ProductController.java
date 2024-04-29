package com.example.accenturerestapi.controller;

import com.example.accenturerestapi.controller.model.ProductId;
import com.example.accenturerestapi.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ProductController {

    @PostMapping("/product")
    public ResponseEntity<ProductId> createProduct(@RequestBody final Product product) {
        System.out.println(product);
        ProductId result = new ProductId(UUID.randomUUID().toString());

        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
    }
}
