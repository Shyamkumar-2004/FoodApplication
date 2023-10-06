package com.foodapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.entity1.Entity1;
import com.foodapp.entity2.Entity2;
import com.foodapp.entity3.Entity3;
import com.foodapp.service.serviceclass;

import com.foodapp.service1.service1;
import com.foodapp.service2.serviceclass2;
import com.foodapp.service3.serviceclass3;

@RestController
public class controllerclass {

	@Autowired
	serviceclass service;
	@Autowired
	service1 ser;
	@Autowired
	serviceclass2 ser1;
	@Autowired
	serviceclass3 service1;

	@PostMapping("/savelogindata")
	public Entity1 savelogindata(@RequestBody Entity1 login) {

		return ser.savelogin_data(login);

	}

	@GetMapping("/getlogin_data")
	public List<Entity1> getlogindata() {
		return ser.getlogin_data();
	}

	@GetMapping("/getlogindata/{id}")
	public String getdata(@PathVariable int id, @RequestParam String name, @RequestParam String password) {
		Entity1 entity = ser.getdataby_id(id);

		if (entity != null) {
			System.out.println("Retrieved Name: " + entity.getUser_name());
			System.out.println("Retrieved Password: " + entity.getUser_password());

			if (entity.getUser_name().equals(name) && entity.getUser_password().equals(password)) {
				return "success";
			} else {
				return "error(data does not match)";
			}
		} else {
			System.out.println("Entity not found for id: " + id);
			return "error(data not found)";
		}
	}

	@PostMapping("/savehotel_data")
	public Entity2 savehotel_details(@RequestBody Entity2 list) {
		return ser1.gethotel_data(list);
	}

	@GetMapping("/gethotel_details")
	public List<Entity2> getdetails() {
		return ser1.gethotel_details();
	}

	@PostMapping("/savefood_items/{hotelId}")
	public Entity3 savefoodItems(@RequestBody Entity3 foodItems, @PathVariable int hotelId) {
		return service1.savefood_items(foodItems, hotelId);
	}

	@GetMapping("/getfood_items/{hotel_id}")
	public Optional<Entity3> getfoodbyhotel_id(@PathVariable int hotel_id) {
		return service1.findByHotelname(hotel_id);
	}

}
