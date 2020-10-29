package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Numbers;
import com.example.demo.repository.AdditionRepository;

@Service
public class AddService {
	@Autowired
	AdditionRepository additionRepository;
	
	public int add(Numbers numbers) {
		int result = numbers.getA()+numbers.getB();
		///additionRepository.save(numbers);
		///System.out.println(additionRepository.findAll());
		return result;
	}
}