package com.example.myrestapi.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trip, Long> {

    @Query("select t from Trip t where t.tili_idtili = ?1")
    List<Trip> findBytili_idtili(Integer tili_idtili);

}
