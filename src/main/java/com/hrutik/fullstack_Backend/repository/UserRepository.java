package com.hrutik.fullstack_Backend.repository;

import com.hrutik.fullstack_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
