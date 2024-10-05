package ar.com.laboratory.ecommerce.infrastructure.configuration;


import ar.com.laboratory.ecommerce.application.repository.ProductRepository;
import ar.com.laboratory.ecommerce.application.repository.UserRepository;
import ar.com.laboratory.ecommerce.application.service.ProductService;
import ar.com.laboratory.ecommerce.application.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ProductService productService(ProductRepository productRepository){
        return new ProductService(productRepository);
    }

    @Bean
    public UserService userService(UserRepository userRepository){
        return new UserService(userRepository);
    }

}
