package ar.com.laboratory.ecommerce.application.repository;

import ar.com.laboratory.ecommerce.domain.User;

import java.util.Optional;

public interface UserRepository {
    Iterable<User> getUsers();
    Optional<User> getUserById(Integer id);
    Optional<User> save(User user);
    void deleteUser(Integer id);
    Optional<User> update(User user);

}
