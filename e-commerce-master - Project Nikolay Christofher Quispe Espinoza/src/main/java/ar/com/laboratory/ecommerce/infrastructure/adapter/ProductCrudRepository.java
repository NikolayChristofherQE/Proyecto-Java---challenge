package ar.com.laboratory.ecommerce.infrastructure.adapter;

import ar.com.laboratory.ecommerce.infrastructure.entity.ProductEntity;
import ar.com.laboratory.ecommerce.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<ProductEntity,Integer> {

Iterable<ProductEntity> findAllByUser(UserEntity userEntity);
ProductEntity findByCode(String code);
}
