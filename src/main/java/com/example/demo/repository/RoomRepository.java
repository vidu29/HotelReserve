package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.RoomEntity;
public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
	@Query(value="select*from product_entity where product_id=:id",nativeQuery = true)
    public RoomEntity getRoomsByRoomId(@Param("id") long roomId);
	
	@Query(value="select * distinct product_id from buy_product_entity ",nativeQuery = true)
    public Long[] getAllRoomId();
	
	@Query(value="select*from product_entity where product_id=:id",nativeQuery = true)
    public RoomEntity getAllRooms(@Param("id") long roomId);

	

}
