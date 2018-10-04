package com.apap.tutorial4.service;

import java.util.Optional;

import com.apap.tutorial4.repository.DealerDb;
import com.apap.tutorial4.model.DealerModel;

public interface DealerService {
	Optional<DealerModel> getDealerDetailById(Long id);
	
	void addDealer(DealerModel dealer);

	void deleteDealer(DealerModel dealer);

	void updateDealer(long id, Optional<DealerModel> dealer);

	DealerDb viewAll();
}

