package com.foodapp.entity2;

import java.util.List;

import com.foodapp.entity3.Entity3;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Entity2 {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int hotel_id;
	private String hotel_name;
	
	 @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	    private List<Entity3> foods;


	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public Entity2(int hotel_id, String hotel_name, int hotel_mobile) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;

	}

	public Entity2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Entity2 [hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + "]";
	}

}
