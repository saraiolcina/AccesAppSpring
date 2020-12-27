package com.homeownersacces.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeownersacces.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
