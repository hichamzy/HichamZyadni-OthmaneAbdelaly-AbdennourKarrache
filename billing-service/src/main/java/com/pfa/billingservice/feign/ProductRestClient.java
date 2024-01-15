package com.pfa.billingservice.feign;

import com.pfa.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductRestClient {

    @GetMapping("/products/{id}")
    Product getProductById(@RequestHeader("Authorization") String token, @PathVariable Long id);


    @GetMapping("/products")
    PagedModel<Product> getPageProducts(
            @RequestHeader("Authorization") String token,
            @RequestParam(value="page") int page,
            @RequestParam(value="size") int size
            );

    @PutMapping("/products/{id}")
    Product updateProduct(
            @RequestHeader("Authorization") String token,
            @PathVariable Long id,
            @RequestBody Product product);
}
