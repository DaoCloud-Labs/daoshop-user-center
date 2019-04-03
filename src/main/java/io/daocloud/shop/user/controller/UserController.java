package io.daocloud.shop.user.controller;

import io.daocloud.shop.user.entity.UserEntity;
import io.daocloud.shop.user.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package io.daocloud.shop.user.controller
 * @Classname UserController
 * @Description TODO
 * @Date 2019/3/18 下午4:30
 * @Created by chenghao
 * @desc UserController
 * @project user-center
 */

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/registry")
    public UserEntity registry(@RequestBody UserEntity user){
        return userRepository.save(user);
    }
    @PostMapping("/login")
    public UserEntity login(@RequestBody UserEntity user){
        return userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword())
                .orElseThrow(()->new RuntimeException("username or password not right"));
    }
    @GetMapping("/users")
    private Iterable<UserEntity> getAllUser(){
        return userRepository.findAll();
    }
}
