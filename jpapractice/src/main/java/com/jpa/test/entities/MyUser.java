package com.jpa.test.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class MyUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String state;
	
	private String city;

	
	public MyUser(int id, String name, String state, String city) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.city = city;
	}
	
	public MyUser() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", state=" + state + ", city=" + city + "]";
	}
	
}

