package com.problem.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.problem.event.entities.Guestentites;

public interface Guestrepo extends JpaRepository<Guestentites, Integer>{

}
