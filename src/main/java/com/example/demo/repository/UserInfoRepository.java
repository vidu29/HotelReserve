package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.UserInfoEntity;
public interface UserInfoRepository extends JpaRepository<UserInfoEntity,Long>{
	@Query(value="select*from user_info_entity where user_email=:email",nativeQuery = true)
    public UserInfoEntity findUserByEmail(@Param("email") String userEmail);

	@Query(value="select u.user_id,u.user_address,u.user_age,u.user_contact_number,u.user_country,u.user_district,u.user_email,u.user_first_name,u.user_gender,u.user_img_url,u.user_last_name,u.user_pincode,u.user_state from user_info_entity u inner join buy_product_entity b on b.user_email=u.user_email where b.product_id=:id",nativeQuery = true)
    public List<UserInfoEntity> getAllUserByProductId(@Param("id") long userEmail);

}
