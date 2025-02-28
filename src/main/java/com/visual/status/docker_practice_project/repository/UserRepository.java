package com.visual.status.docker_practice_project.repository;

import com.visual.status.docker_practice_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
