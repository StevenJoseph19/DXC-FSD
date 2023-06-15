package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Speaker;
import com.mycompany.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository;

	public SpeakerServiceImpl() {

	}

	public SpeakerServiceImpl(SpeakerRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Speaker> findAll() {
		return repository.findAll();
	}

	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}

}
