package com.jmpdev.repository;

import com.jmpdev.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2016-02-03.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    public UserRole findByRoleName(String roleName);

}
