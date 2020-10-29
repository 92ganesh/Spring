package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Numbers;
public interface AdditionRepository extends  JpaRepository<Numbers,Integer>{

}
