package com.foodapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.entity.Entityclass;
import com.foodapp.repository.repoclass;

@Service
public class serviceclass {

	@Autowired
	repoclass repo;

	public Entityclass getdataby_id(int id) {
		Optional<Entityclass> en = repo.findById(id);

		if (en.isPresent()) {
			return en.get();
		} else {
			return null;
		}
	}
}
