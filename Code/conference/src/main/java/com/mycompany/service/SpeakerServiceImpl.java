package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Speaker;
import com.mycompany.repository.HibernateSpeakeRepositoryImpl;
import com.mycompany.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository = new HibernateSpeakeRepositoryImpl();
	
	@Override
	public List<Speaker> findAll() {
		return repository.findAll();
	}
}
