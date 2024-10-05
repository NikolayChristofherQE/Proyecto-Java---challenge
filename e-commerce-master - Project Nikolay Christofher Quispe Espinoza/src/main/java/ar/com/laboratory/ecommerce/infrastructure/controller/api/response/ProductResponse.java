package ar.com.laboratory.ecommerce.infrastructure.controller.api.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ProductResponse {
    @Schema(description = "Product code", example = "PROD123")
    private String code;

    @Schema(description = "Product name", example = "Sample Product")
    private String name;

    @Schema(description = "Product description", example = "A description of the product")
    private String description;

    @Schema(description = "URL of product image", example = "https://example.com/product.jpg")
    private String image;

    @Schema(description = "Price of the product", example = "19.99")
    private BigDecimal price;

    @Schema(description = "Date the product was created", example = "2023-10-11T10:30:00Z")
    private LocalDateTime dateCreated;

    @Schema(description = "Date the product was last updated", example = "2023-10-11T14:45:00Z")
    private LocalDateTime dateUpdated;

}