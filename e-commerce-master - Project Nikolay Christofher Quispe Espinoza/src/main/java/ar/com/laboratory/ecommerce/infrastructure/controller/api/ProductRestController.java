package ar.com.laboratory.ecommerce.infrastructure.controller.api;

import ar.com.laboratory.ecommerce.application.service.ProductService;
import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.request.ProductRequest;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.ProductResponse;
import ar.com.laboratory.ecommerce.infrastructure.mapper.ProductMapper;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@Tag(name = "Product", description = "Operations related to products")
@AllArgsConstructor

public class ProductRestController {

    private ProductService productService;
    private ProductMapper mapper;

    @GetMapping("/health")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "For Success", content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = Exception.class))),
    })
    public ResponseEntity<String> health(){
        return ResponseEntity
                .ok()
                .body("OK");}
    @GetMapping("/products")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "For Success", content = @Content(schema = @Schema(implementation = ProductResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = Exception.class))),
    })
    public ResponseEntity<Iterable<ProductResponse>> getProducts(){
        return  ResponseEntity
                .ok()
                .body(mapper.toProductsResponses(productService.getProducts()));
    }
    @GetMapping("/{id}")
    @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = ProductResponse.class)))
    public ResponseEntity<Iterable<ProductResponse>> getProduct(@PathVariable Integer id){
        return  ResponseEntity
                .ok()
                .body(mapper.toProductsResponses(productService.getProducts()));
    }

    @PostMapping
    public ResponseEntity<ProductResponse> save(@RequestBody ProductRequest request){
        return ResponseEntity
                .ok()
                .body(mapper.productToResponse(productService.save(mapper.requestToProduct(request))));
    }
    @PutMapping
    public ResponseEntity<ProductResponse> update(@RequestBody ProductRequest request){
        return ResponseEntity
                .ok()
                .body(mapper.productToResponse(productService.save(mapper.requestToProduct(request))));
    }
    @DeleteMapping({"/{id}"})
    public ResponseEntity<ProductResponse> update(@PathVariable Integer id){
        productService.deleteProduct(id);
        return ResponseEntity
                .noContent()
                .build();
    }

}
