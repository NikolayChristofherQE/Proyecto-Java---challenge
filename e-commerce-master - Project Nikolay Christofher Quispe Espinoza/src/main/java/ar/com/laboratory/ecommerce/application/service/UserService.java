package ar.com.laboratory.ecommerce.application.service;


import ar.com.laboratory.ecommerce.application.repository.UserRepository;
import ar.com.laboratory.ecommerce.domain.User;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.getUsers();
    }


    public User getUserById(Integer id) {
        return userRepository.getUserById(id).get();
    }


    public User save(User user) {
        return userRepository.save(user).get();
    }

    public User update(User user) {
        return userRepository.update(user).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }
}
