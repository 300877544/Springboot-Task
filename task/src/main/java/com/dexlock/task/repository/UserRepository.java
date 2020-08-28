package com.dexlock.task.repository;

import com.dexlock.task.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;


public interface UserRepository extends JpaRepository<User, Long> {
Optional<User> findByUsername(String username);
Boolean existsByUsername(String username);
Boolean existsByEmail(String email);
}
