package ar.com.laboratory.ecommerce.application.repository;

import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.domain.User;


//ESTO ES UN PUERTO
public interface ProductRepository {
    Iterable<Product> getProducts();
    Iterable<Product> getProductsByUser(User user);
    Product getProductById(Integer id);
    Product save(Product product);
    void deleteProduct(Integer id);
    Product update(Product product);
    Product findByCode(String code);
}
