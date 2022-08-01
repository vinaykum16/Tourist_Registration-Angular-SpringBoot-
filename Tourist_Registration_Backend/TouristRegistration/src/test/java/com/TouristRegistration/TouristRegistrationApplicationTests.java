package com.TouristRegistration;

import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

import com.TouristRegistration.Entity.Tourist;
import com.TouristRegistration.Repository.TouristRepository;
import com.TouristRegistration.Service.TouristService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TouristRegistrationApplicationTests {

	@Autowired
	private TouristService tService;
	
	@MockBean
	private TouristRepository tRepo;
	
	@Test
	void contextLoads() {
	}
	
	

	@Test
	public void createTourist() {
		Tourist t = new Tourist(121, "Golu", "Kumar", "Male", 23, "Delhi", 4);
		when(tRepo.save(t)).thenReturn(t);
		assertEquals(t, tService.addTourist(t));
	}
	
	
	


}
