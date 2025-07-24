package org.sn.shopliker.services;

import org.sn.shopliker.entity.Category;
import org.sn.shopliker.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    Category updateProduct(Product product);
    void deleteProduct(Product product);
    Product findProductById(Long id);
    List<Product> findAllProducts();
}
