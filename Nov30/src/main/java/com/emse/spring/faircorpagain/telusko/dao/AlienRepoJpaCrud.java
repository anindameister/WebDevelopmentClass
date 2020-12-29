package com.emse.spring.faircorpagain.telusko.dao;

import com.emse.spring.faircorpagain.telusko.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlienRepoJpaCrud extends JpaRepository<Alien, Integer> {

}
