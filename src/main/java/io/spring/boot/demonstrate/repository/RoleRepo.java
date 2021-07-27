package io.spring.boot.demonstrate.repository;

import io.spring.boot.demonstrate.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String rolename);
}
