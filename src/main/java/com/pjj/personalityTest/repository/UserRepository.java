package com.pjj.personalityTest.repository;

import com.pjj.personalityTest.vo.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDto, String> {

    public Optional<UserDto> findById(String userId);

}
