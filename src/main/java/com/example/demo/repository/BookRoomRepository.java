package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.BookRoomEntity;
public interface BookRoomRepository extends JpaRepository<BookRoomEntity, Long>{
	@Query(value="select*from buy_product_entity where user_email=:email",nativeQuery = true)
    public List<BookRoomEntity> findAllByEmail(@Param("email") String userEmail);
	
	@Query(value="select*from buy_product_entity where product_id=:id",nativeQuery = true)
    public List<BookRoomEntity> findAllByRoomId(@Param("id") long roomId);

}
