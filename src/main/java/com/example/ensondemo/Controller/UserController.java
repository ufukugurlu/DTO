package com.example.ensondemo.Controller;


import com.example.ensondemo.DTO.UserDTO;
import com.example.ensondemo.Entity.User;
import com.example.ensondemo.Service.Impl.UserServiceImpl;
import com.example.ensondemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    UserService userService;




    @RequestMapping(value="/all" ,method = RequestMethod.GET)
    public  List<User> getAll(){


        return  userService.findAll();

    }

    @GetMapping("/{id}")
    public  ResponseEntity<UserDTO> findById(@PathVariable Integer id){


       UserDTO user = userService.convertUserToDTO(userService.findById(id));

        return new  ResponseEntity<UserDTO>(user, HttpStatus.OK);

    }
    @PostMapping("/")
    public ResponseEntity create(@RequestBody User user) {

        return ResponseEntity.ok(userService.save(user));


    }

    @PutMapping("/{id}")
    public  ResponseEntity<User> update(@PathVariable Integer id , @Valid @RequestBody User user){


        userService.deleteById(id);
        return ResponseEntity.ok().build();


        }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {

        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    }






