package com.alexandrerogerio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrerogerio.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
