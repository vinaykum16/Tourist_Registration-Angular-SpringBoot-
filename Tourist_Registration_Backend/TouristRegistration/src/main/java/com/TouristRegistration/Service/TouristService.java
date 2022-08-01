package com.TouristRegistration.Service;

import java.util.List;

import com.TouristRegistration.Entity.Tourist;
import com.TouristRegistration.Repository.TouristRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TouristService {
	
	@Autowired
	private TouristRepository tRepo;

	public Tourist addTourist(Tourist tourist) {
		return tRepo.save(tourist);
	}


	public Tourist getById(int id) {
		return tRepo.findById(id).orElse(null);
	}

	public List<Tourist> getTouristList() {
		return tRepo.findAll(Sort.by(Sort.Direction.DESC,"tfName"));
	}


}
