package ru.netology.domain;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(ProductItem item) {
        repository.save(item);

    }
}
