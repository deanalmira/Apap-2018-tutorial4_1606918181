package com.apap.tutorial4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apap.tutorial4.model.CarModel;

public interface CarDb extends JpaRepository<CarModel, Long>{
	CarModel findByType(String type);
	
	List<CarModel> findByDealerIdOrderByPriceDesc(long dealer_id);
}
