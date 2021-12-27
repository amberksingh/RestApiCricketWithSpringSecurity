package com.cricket.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Entity
public class Player {
	
	//@Value("9")
	@Id
	private int age;
	private String name;
	
	
	public Player(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "player [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
