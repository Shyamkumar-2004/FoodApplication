package com.foodapp.repository2;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.foodapp.entity2.Entity2;
@Repository
public interface repoclass2 extends JpaRepository<Entity2, Integer> {

}
