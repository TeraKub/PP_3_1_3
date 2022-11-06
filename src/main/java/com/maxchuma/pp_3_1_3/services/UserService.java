package com.maxchuma.pp_3_1_3.services;

import com.maxchuma.pp_3_1_3.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

// UserDetailsService предоставляет юзера по имени пользователя
public interface UserService extends UserDetailsService {
    User findByUsername(String username);
    List<User> allUsers();
    boolean saveNewUser(User user);
    void saveEditUser(User user);
    User getUserById(int id);
    void delete(int id);
}
