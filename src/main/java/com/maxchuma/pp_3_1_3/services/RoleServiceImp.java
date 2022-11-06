package com.maxchuma.pp_3_1_3.services;

import com.maxchuma.pp_3_1_3.models.Role;
import com.maxchuma.pp_3_1_3.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService{
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> listRoles() {
        return roleRepository.findAll();
    }
}
