package com.changeside.LazyVsEagerInitializationDemo.repository;

import com.changeside.LazyVsEagerInitializationDemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
