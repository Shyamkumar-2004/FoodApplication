package com.foodapp.repository3;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.foodapp.entity3.Entity3;

@Repository
public interface repoclass3 extends JpaRepository<Entity3, Integer> {
	
	@Query("SELECT e FROM Entity3 e WHERE e.food_name = :foodName")
    List<Entity3> findByFoodName(@Param("foodName") String foodName);
		
	}
		

