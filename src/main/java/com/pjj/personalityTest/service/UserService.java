package com.pjj.personalityTest.service;

import com.pjj.personalityTest.repository.UserRepository;
import com.pjj.personalityTest.vo.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<UserDto> getUserInfo(String userId){
        return userRepository.findById(userId);
    }

}
