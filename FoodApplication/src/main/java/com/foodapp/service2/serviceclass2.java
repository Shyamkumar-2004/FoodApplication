package com.foodapp.service2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.entity2.Entity2;
import com.foodapp.repository2.repoclass2;

@Service
public class serviceclass2 {

	@Autowired
	repoclass2 repo;

	public Entity2 gethotel_data(Entity2 data) {
		return repo.save(data);
	}

	public List<Entity2> gethotel_details() {
		return repo.findAll();

	}

}
