package ar.com.laboratory.ecommerce.infrastructure.mapper;


import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.domain.User;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.request.ProductRequest;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.ProductResponse;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.UserResponse;
import ar.com.laboratory.ecommerce.infrastructure.entity.ProductEntity;
import ar.com.laboratory.ecommerce.infrastructure.entity.UserEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "image", target = "image"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "dateCreated", target = "dateCreated"),
            @Mapping(source = "dateUpdated", target = "dateUpdated"),
            @Mapping(source = "user", target = "user")})
    Product toProduct(ProductEntity entity);

    @InheritConfiguration
    ProductEntity toEntity(Product user);

    Iterable<Product>toProducts(Iterable<ProductEntity> userEntities);
    Iterable<ProductEntity>toProductsEntities(Iterable<Product> user);

    @Mappings({
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "image", target = "image"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "dateCreated", target = "dateCreated"),
            @Mapping(source = "dateUpdated", target = "dateUpdated")})
    ProductResponse productToResponse(Product product);
    @InheritConfiguration
    Product requestToProduct(ProductRequest response);

    Iterable<Product>responsesToProducts(Iterable<ProductResponse> responses);
    Iterable<ProductResponse>toProductsResponses(Iterable<Product> products);

}
