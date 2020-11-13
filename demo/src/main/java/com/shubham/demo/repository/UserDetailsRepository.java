package com.shubham.demo.repository;

import com.shubham.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findByUsername(String name);

}
