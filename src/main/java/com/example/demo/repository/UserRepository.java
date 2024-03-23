package com.example.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>  {
	@Query(value="select user_password from user_entity where user_name=:name",nativeQuery = true)
    public String findUserPassword(@Param("name") String userName);
	
	@Query(value="select*from user_entity where user_email=:email",nativeQuery = true)
   public UserEntity getUserByEmail(@Param("email") String userName);

	@Query(value="select*from user_entity where user_id=:id",nativeQuery = true)
	public UserEntity  findById(@Param("id")Long userId);

	@Query(value="delete*from user_entity where user_id=:id",nativeQuery = true)
	public void deleteById(@Param("id")long userId);

}
