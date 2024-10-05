package ar.com.laboratory.ecommerce.infrastructure.mapper;


import ar.com.laboratory.ecommerce.domain.User;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.request.UserRequest;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.UserResponse;
import ar.com.laboratory.ecommerce.infrastructure.entity.UserEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "firstName", target = "firstName") ,
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "cellphone", target = "cellphone"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "userType", target = "userType"),
            @Mapping(source = "dateCreated", target = "dateCreated")})
    User toUser(UserEntity entity);
    @InheritConfiguration
    UserEntity toEntity(User user);
    Iterable<User>toUsers(Iterable<UserEntity> userEntities);
    Iterable<UserEntity>toUsersEntities(Iterable<User> user);
    @Mappings({
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "firstName", target = "firstName") ,
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "cellphone", target = "cellphone"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "userType", target = "userType"),
            @Mapping(source = "dateCreated", target = "dateCreated")})
    UserResponse userToResponse(User user);

    @Mappings({
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "firstName", target = "firstName") ,
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "cellphone", target = "cellphone"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "userType", target = "userType"),
            @Mapping(source = "dateCreated", target = "dateCreated")})
    User requestToUser(UserRequest request);
    Iterable<UserResponse>toUsersResponses(Iterable<User> user);

}
