package com.mycompany.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Speaker;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakeRepositoryImpl implements SpeakerRepository {
	
	@Autowired
	private Calendar cal;
	
	@Value("#{ T(java.lang.Math).random() * 100 }")
	private double seedNum;

	@Override
	public List<Speaker> findAll() {

		List<Speaker> speakers = new ArrayList<>();

		Speaker speaker = new Speaker();

		speaker.setFirstName("John");
		speaker.setLastName("Doe");
		speaker.setSeedNum(seedNum);
		
		System.out.println("cal: " + cal.getTime());

		speakers.add(speaker);

		return speakers;

	}

	

}
