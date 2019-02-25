package com.bike.configurations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bike.configurations.entity.User;

//@RepositoryRestResource(path = "/users")
@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {
}
