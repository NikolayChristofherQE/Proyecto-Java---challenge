package ar.com.laboratory.ecommerce.infrastructure.controller;

import ar.com.laboratory.ecommerce.application.service.ProductService;
import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.domain.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/products")
@Slf4j
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/create")
    public String create(){
        return "admin/products/create";
    }

    @PostMapping("/save-product")
    public String saveProduct(Product product){
        log.info("Nombre de producto: {}", product);
        productService.save(product);
        return "redirect:/admin";
    }
    @GetMapping("/show")
    public String showProduct(Model model){
        User user = new User();
        user.setId(1);
        Iterable<Product> products = productService.getProductsByUser(user);
        model.addAttribute("products", products);
        return "admin/products/show";
    }


    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        Product product = productService.getProductById(id);
        log.info("Product obtenido: {}", product);
        model.addAttribute("product",product);
        return "admin/products/edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/admin/products/show";
    }


}
