package com.example.ensondemo.Reporistory;

import com.example.ensondemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

        User findByUserId(Integer userId);



}
