package com.challenge.payGoal.controller;

import com.challenge.payGoal.NotFoundException;
import com.challenge.payGoal.model.Product;
import com.challenge.payGoal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) throws NotFoundException {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException());

        product.setName(updatedProduct.getName());
        product.setDescription(updatedProduct.getDescription());
        product.setPrice(updatedProduct.getPrice());
        product.setQuantity(updatedProduct.getQuantity());

        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) throws NotFoundException {
        return productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException());
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

    @GetMapping("/sorted-by-price")
    public List<Product> getAllProductsSortedByPrice() {
        return productRepository.findAllByOrderByPrice();
    }
}
