package com.example.myrestapi.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(path="/")
public class MyRestController {

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json")
    public ResponseEntity<String> hello() {
        System.out.println("hello!");
        return new ResponseEntity<String>("Hello, you!", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/about", produces = "application/json")
    public ResponseEntity<String> about() {
        System.out.println("about!");
        return new ResponseEntity<String>("Fishing Diary server.", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/trip", produces = "application/json")
    public @ResponseBody Iterable<Trip> getAllTrips() {
        // This returns a JSON or XML with the trips
        return tripRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/trip/{id}", produces = "application/json")
    public @ResponseBody Iterable<Trip> getTripsById(@PathVariable("id") Integer id) {
        // This returns a JSON or XML with the trips
        return tripRepository.findBytili_idtili(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/user", produces = "application/json")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

}