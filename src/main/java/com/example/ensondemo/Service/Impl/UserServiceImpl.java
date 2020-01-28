package com.example.ensondemo.Service.Impl;



import com.example.ensondemo.DTO.UserDTO;
import com.example.ensondemo.Entity.User;
import com.example.ensondemo.Reporistory.UserRepository;
import com.example.ensondemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer userId) {
       User user = userRepository.findByUserId(userId);
       return user;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {



    }

    @Override
    public UserDTO convertUserToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.id = user.getId();
        userDTO.firstName = user.getFirstName();
        userDTO.lastName = user.getLastName();
        return  userDTO;
    }
}

