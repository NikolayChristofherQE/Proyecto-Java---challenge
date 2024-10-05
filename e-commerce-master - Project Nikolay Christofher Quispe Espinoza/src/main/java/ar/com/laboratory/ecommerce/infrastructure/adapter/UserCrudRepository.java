package ar.com.laboratory.ecommerce.infrastructure.adapter;

import ar.com.laboratory.ecommerce.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


//ADAPTADOR
public interface UserCrudRepository extends CrudRepository<UserEntity,Integer> {
}
