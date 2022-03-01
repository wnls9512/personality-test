package com.pjj.personalityTest.controller;

import com.pjj.personalityTest.service.UserService;
import com.pjj.personalityTest.vo.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserInfo(@PathVariable("userId") String userId){
        Optional<UserDto> user = userService.getUserInfo(userId);
        logger.debug("user = {}", user);
        return new ResponseEntity<UserDto>(user.get(), HttpStatus.OK);
    }

}
