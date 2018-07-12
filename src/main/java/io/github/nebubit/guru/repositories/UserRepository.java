package io.github.nebubit.guru.repositories;

import io.github.nebubit.guru.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}