package com.foodapp.repository1;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.foodapp.entity1.Entity1;

@Repository
public interface repoclass1 extends JpaRepositoryImplementation<Entity1, Integer> {

}