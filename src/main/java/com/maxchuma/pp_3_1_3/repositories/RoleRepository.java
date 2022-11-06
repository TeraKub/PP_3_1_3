package com.maxchuma.pp_3_1_3.repositories;

import com.maxchuma.pp_3_1_3.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
