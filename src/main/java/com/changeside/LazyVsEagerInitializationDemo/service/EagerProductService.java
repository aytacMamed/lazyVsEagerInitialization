package com.changeside.LazyVsEagerInitializationDemo.service;

import com.changeside.LazyVsEagerInitializationDemo.model.Product;
import com.changeside.LazyVsEagerInitializationDemo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EagerProductService {
    private final ProductRepository productRepository;

    public EagerProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
        System.out.println("EagerProductService initialized eagerly.");
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
