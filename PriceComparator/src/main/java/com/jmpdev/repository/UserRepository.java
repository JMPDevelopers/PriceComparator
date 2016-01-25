package com.jmpdev.repository;

import com.jmpdev.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by HP on 2016-01-25.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
