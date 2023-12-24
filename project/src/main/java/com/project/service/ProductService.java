package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Product;
import com.project.repo.ProductRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepo productRepository;

    @Autowired
    public ProductService(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String productId) {
        return productRepository.findById(productId);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

//    public Product updateProduct(String productId, Product updatedProduct) {
//        if (productRepository.existsById(productId)) {
//            updatedProduct.setProductId(productId);
//            return productRepository.save(updatedProduct);
//        }
//        return null; // Handle not found scenario as needed
//    }

    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }
}

