package com.rideforfree.repository;

import java.util.List;

import com.rideforfree.model.Ride;

public interface RideRepository {

	Ride createRide(Ride ride);

	List<Ride> getRides();

	Ride getRide(Integer id);

	Ride updateRide(Ride ride);

	void updateRides(List<Object[]> pairs);

	void deleteRide(Integer id);

}