package com.example.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

import com.example.SpringSecurity.Entity.UserInfo;

import java.util.Optional;

//@Repository
//public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
  //  Optional<UserInfo> findByName(String username);

    //UserInfo save(UserInfo userInfo); 
   

    @Repository
    public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

		Optional<UserInfo> findByName(String username);
    }

//}
