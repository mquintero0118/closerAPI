package com.salesass.closer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salesass.closer.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}