package com.mycompany.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mycompany.model.Speaker;
import com.mycompany.repository.HibernateSpeakeRepositoryImpl;
import com.mycompany.repository.SpeakerRepository;

@Service("speakerService")
//@Scope()
@Profile("dev")
//@Profile("prod")
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository;

	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
	}

	@Autowired
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("SpeakerServiceImpl repository constructor");
		this.repository = speakerRepository;
	}

	@PostConstruct
	private void initialize() {
		System.out.println("We're called after the constructors.");
	}

	@Override
	public List<Speaker> findAll() {
		return repository.findAll();
	}

//	@Autowired
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl setter");
		this.repository = repository;
	}

}
