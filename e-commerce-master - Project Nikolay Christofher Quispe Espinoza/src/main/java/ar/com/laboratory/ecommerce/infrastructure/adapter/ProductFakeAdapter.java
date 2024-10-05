package ar.com.laboratory.ecommerce.infrastructure.adapter;


import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.domain.User;
import ar.com.laboratory.ecommerce.infrastructure.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


//ESTO ES OTRO ADAPTADOR
@Data
@AllArgsConstructor
public class ProductFakeAdapter {

    
    public Iterable<Product> getProducts() {

        return generateProductIterable(5);
    }

    
    public Iterable<Product> getProductsByUser(User user) {
        return generateProductIterable(5);
    }

    
    public Product getProductById(Integer id) {
        return generateProductSupplier().get();
    }

    
    public Product save(Product product) {
        return  generateProductSupplier().get();
    }

    
    public void deleteProduct(Integer id) {
        // No hago nada
    }

    public static Supplier<Product> generateProductSupplier() {
        return () -> {
            Product product = new Product();
            product.setId(1);  // Id de ejemplo
            product.setCode("PROD123");
            product.setName("Ejemplo de Producto");
            product.setDescription("Descripción del producto de ejemplo");
            product.setImage("imagen.jpg");
            product.setPrice(new BigDecimal("100.00"));
            product.setDateCreated(LocalDateTime.now());
            product.setDateUpdated(LocalDateTime.now());
            product.setUser(new User());  // Asegúrate de crear una instancia de UserEntity válida
            return product;
        };
    }

    public static Iterable<Product> generateProductIterable(int count) {
        Supplier<Product> productSupplier = generateProductSupplier();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            products.add(productSupplier.get());
        }
        return products;
    }
}
