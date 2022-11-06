package com.maxchuma.pp_3_1_3.repositories;

import com.maxchuma.pp_3_1_3.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
