package com.foodapp.service3;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.entity2.Entity2;
import com.foodapp.entity3.Entity3;
import com.foodapp.repository3.repoclass3;

@Service
public class serviceclass3 {

	@Autowired
	repoclass3 repo;

	public Entity3 gethotel_data(Entity3 data) {
		return repo.save(data);
	}

	public Entity3 savefood_items(Entity3 foodItems, int hotelId) {
		Entity2 hotel = new Entity2();
		hotel.setHotel_id(hotelId);
		foodItems.setHotel(hotel);

		return repo.save(foodItems);
	}

	 public List<Entity3> findByFoodName(String foodName) {
	        return repo.findByFoodName(foodName);
	    }

	public Optional<Entity3> findByHotelname(int hotel_id) {
		// TODO Auto-generated method stub
		return repo.findById(hotel_id);
	}
}
