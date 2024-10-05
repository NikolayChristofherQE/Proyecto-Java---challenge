package ar.com.laboratory.ecommerce.infrastructure.controller.api.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ProductRequest {


    @Schema(description = "Product name", example = "Sample Product")
    private String name;

    @Schema(description = "Product description", example = "A description of the product")
    private String description;

    @Schema(description = "URL of product image", example = "https://example.com/product.jpg")
    private String image;

    @Schema(description = "Price of the product", example = "19.99")
    private BigDecimal price;



}