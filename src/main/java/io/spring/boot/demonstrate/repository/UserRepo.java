package io.spring.boot.demonstrate.repository;

import io.spring.boot.demonstrate.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepo extends JpaRepository<User, Long>  {

    User findByUsername(String username);
}
