package com.mycompany.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.model.Speaker;

public class HibernateSpeakeRepositoryImpl implements SpeakerRepository {

	@Override
	public List<Speaker> findAll() {

		List<Speaker> speakers = new ArrayList<>();

		Speaker speaker = new Speaker();

		speaker.setFirstName("John");
		speaker.setLastName("Doe");

		speakers.add(speaker);

		return speakers;

	}

}
