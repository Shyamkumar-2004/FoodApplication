package com.foodapp.entity3;

import com.foodapp.entity2.Entity2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Entity3 {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String food_name;
	private double food_rate;
	private double food_ratings;
	private String descriptions;
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private Entity2 hotel;

	// Getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public double getFood_rate() {
		return food_rate;
	}

	public void setFood_rate(double food_rate) {
		this.food_rate = food_rate;
	}

	public double getFood_ratings() {
		return food_ratings;
	}

	public void setFood_ratings(double food_ratings) {
		this.food_ratings = food_ratings;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public Entity2 getHotel() {
		return hotel;
	}

	public void setHotel(Entity2 hotel) {
		this.hotel = hotel;
	}

	public Entity3(int id, String food_name, double food_rate, double food_ratings, String descriptions) {
		super();
		this.id = id;
		this.food_name = food_name;
		this.food_rate = food_rate;
		this.food_ratings = food_ratings;
		this.descriptions = descriptions;
	}

	public Entity3() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Entity3 [id=" + id + ", food_name=" + food_name + ", food_rate=" + food_rate + ", food_ratings="
				+ food_ratings + ", descriptions=" + descriptions + "]";
	}

}
