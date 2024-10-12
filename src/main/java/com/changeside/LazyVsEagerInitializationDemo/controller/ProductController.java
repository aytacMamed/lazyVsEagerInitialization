package com.changeside.LazyVsEagerInitializationDemo.controller;

import com.changeside.LazyVsEagerInitializationDemo.model.Product;
import com.changeside.LazyVsEagerInitializationDemo.service.EagerProductService;
import com.changeside.LazyVsEagerInitializationDemo.service.LazyProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

//    private final EagerProductService eagerProductService;
    private final LazyProductService lazyProductService;

    public ProductController( LazyProductService lazyProductService) {
//        this.eagerProductService = eagerProductService;
        this.lazyProductService = lazyProductService;
    }

    // Eager üçün metodlar
//    @PostMapping("/eager/save")
//    public Product createEagerProduct(@RequestBody Product product) {
//        return eagerProductService.createProduct(product);
//    }
//
//    @GetMapping("/eager")
//    public List<Product> getAllEagerProducts() {
//        return eagerProductService.getAllProducts();
//    }
//
//    @GetMapping("/eager/{id}")
//    public Product getEagerProductById(@PathVariable Long id) {
//        return eagerProductService.getProductById(id);
//    }
//
//    @DeleteMapping("/eager/{id}")
//    public void deleteEagerProduct(@PathVariable Long id) {
//        eagerProductService.deleteProduct(id);
//    }

    // Lazy üçün metodlar
    @PostMapping("/lazy")
    public Product createLazyProduct(@RequestBody Product product) {
        return lazyProductService.createProduct(product);
    }


    
    @GetMapping("/lazy")
    public List<Product> getAllLazyProducts() {
        return lazyProductService.getAllProducts();
    }

    @GetMapping("/lazy/{id}")
    public Product getLazyProductById(@PathVariable Long id) {
        return lazyProductService.getProductById(id);
    }

    @DeleteMapping("/lazy/{id}")
    public void deleteLazyProduct(@PathVariable Long id) {
        lazyProductService.deleteProduct(id);
    }
}
