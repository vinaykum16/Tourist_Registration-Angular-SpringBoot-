package com.TouristRegistration.Repository;

import com.TouristRegistration.Entity.Tourist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Integer>{

}
