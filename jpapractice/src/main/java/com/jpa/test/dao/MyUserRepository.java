package com.jpa.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import com.jpa.test.entities.MyUser;


public interface MyUserRepository extends JpaRepository<MyUser, Integer> {

}
