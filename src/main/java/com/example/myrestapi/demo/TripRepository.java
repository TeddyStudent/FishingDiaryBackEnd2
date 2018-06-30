package com.example.myrestapi.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.myrestapi.demo.Trip;

public interface TripRepository extends CrudRepository<Trip, Long> {
}
