package com.foodapp.service1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.entity1.Entity1;
import com.foodapp.repository1.repoclass1;

@Service
public class service1 {

	@Autowired
	repoclass1 repo1;

	public Entity1 getdataby_id(int id) {
		Optional<Entity1> en = repo1.findById(id);

		if (en.isPresent()) {
			return en.get();
		} else {
			return null;
		}
	}

	public Entity1 savelogin_data(Entity1 data) {
		return repo1.save(data);
	}

	public List<Entity1> getlogin_data() {
		return repo1.findAll();
	}

}
