package ar.com.laboratory.ecommerce.application.service;


import ar.com.laboratory.ecommerce.application.repository.ProductRepository;
import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.domain.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.getProducts();
    }


    public Iterable<Product> getProductsByUser(User user) {
        return productRepository.getProductsByUser(user);
    }


    public Product getProductById(Integer id) {
        return productRepository.getProductById(id);
    }


    public Product save(Product product) {
        return productRepository.save(product);
    }


    public void deleteProduct(Integer id) {
        productRepository.deleteProduct(id);
    }
}
