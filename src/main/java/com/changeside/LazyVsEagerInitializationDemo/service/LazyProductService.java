package com.changeside.LazyVsEagerInitializationDemo.service;

import com.changeside.LazyVsEagerInitializationDemo.model.Product;
import com.changeside.LazyVsEagerInitializationDemo.repository.ProductRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Lazy
public class LazyProductService {

    private final ProductRepository productRepository;

    public LazyProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
        System.out.println("LazyProductService initialized lazily.");
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
