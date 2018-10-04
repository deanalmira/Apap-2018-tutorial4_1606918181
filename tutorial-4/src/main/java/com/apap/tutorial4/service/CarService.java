package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.CarModel;

public interface CarService {
	void addCar(CarModel car);
	void delete(String id);
	CarModel getCar(long id);
	void deleteCar(CarModel car);
	void updateCar(long id, CarModel car);
	List<CarModel> sortByPriceDesc(Long dealer_id);
}