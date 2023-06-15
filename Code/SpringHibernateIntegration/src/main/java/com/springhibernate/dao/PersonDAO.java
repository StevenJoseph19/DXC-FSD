package com.springhibernate.dao;

import java.util.List;

import com.springhibernate.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
