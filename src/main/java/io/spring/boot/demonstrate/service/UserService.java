package io.spring.boot.demonstrate.service;

import io.spring.boot.demonstrate.domain.Role;
import io.spring.boot.demonstrate.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    User saveUSer(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String rolename);

    User getUser(String username);

    List<User> getUsers();
}
