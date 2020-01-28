package com.example.ensondemo.Service;

import com.example.ensondemo.DTO.UserDTO;
import com.example.ensondemo.Entity.User;

import java.util.List;


public interface UserService {


      List<User> findAll();
      User findById(Integer userId);
      User save(User user);
      void  deleteById(Integer id);
      UserDTO convertUserToDTO(User user);
}
