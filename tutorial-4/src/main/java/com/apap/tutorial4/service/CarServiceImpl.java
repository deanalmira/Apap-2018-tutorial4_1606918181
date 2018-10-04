package com.apap.tutorial4.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tutorial4.model.CarModel;
import com.apap.tutorial4.repository.CarDb;

@Service
@Transactional
public class CarServiceImpl implements CarService{
	@Autowired
	private CarDb carDb;
	
	@Override
	public void addCar(CarModel car) {
		carDb.save(car);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CarModel getCar(long id) {
		// TODO Auto-generated method stub
		return carDb.findById(id).get();
	}

	@Override
	public void deleteCar(CarModel car) {
		// TODO Auto-generated method stub
		carDb.delete(car);
	}

	@Override
	public void updateCar(long id, CarModel newCar) {
		// TODO Auto-generated method stub
		CarModel car = carDb.getOne(id);
		car.setBrand(newCar.getBrand());
		car.setType(newCar.getType());
		car.setPrice(newCar.getPrice());
		car.setAmount(newCar.getAmount());
		carDb.save(car);
	}
	
	@Override
	public List<CarModel> sortByPriceDesc(Long dealer_id) {
		return carDb.findByDealerIdOrderByPriceDesc(dealer_id);
	}
}
