package com.alkemy.wallet.repository;

import com.alkemy.wallet.dto.UserDto;
import com.alkemy.wallet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}