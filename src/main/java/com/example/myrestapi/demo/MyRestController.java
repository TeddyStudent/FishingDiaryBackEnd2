package com.example.myrestapi.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;

//import com.example.myrestapi.demo.Trip;
//import com.example.myrestapi.demo.TripRepository;

@RestController
@RequestMapping(path="/demo")
public class MyRestController {

    @Autowired

    private TripRepository tripRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "application/json")
    public ResponseEntity<String> hello() {
        System.out.println("Hit me!");
        return new ResponseEntity<String>("Hello, you!", HttpStatus.OK);
    }

    @RequestMapping(path="/all")
    public @ResponseBody Iterable<Trip> getAllUsers() {
        // This returns a JSON or XML with the users
        return tripRepository.findAll();
    }

}