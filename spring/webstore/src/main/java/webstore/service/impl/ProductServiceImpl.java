package webstore.service.impl;/**
 * @author Sergey Zhernovoy
 * create on 16.09.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstore.domain.Product;
import webstore.domain.repository.ProductRepository;
import webstore.service.ProductService;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.getAllProducts();
    }

    @Override
    public void updateAllStock() {
        List<Product> products = productRepository.getAllProducts();
        for (Product product : products) {
            if (product.getUnitsInStock() < 500) {
                productRepository.updateStock(product.getProductId(),
                        product.getUnitsInStock() + 1000);
            }
        }
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return this.productRepository.getProductByCategory(category);
    }

    @Override
    public List<Product> getProductsByFilter(Map<String, List<String>> filter) {
        return this.productRepository.getProductsByFilter(filter);
    }

    @Override
    public void addProduct(Product product) {
        this.productRepository.addProduct(product);
    }

}

    