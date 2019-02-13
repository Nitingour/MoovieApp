package com.example.moovieapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moovieapp.entities.Moovie;
import com.example.moovieapp.services.MoovieService;

@RestController
public class MoovieController {
     @Autowired
    MoovieService mooviservice;
@RequestMapping("/getmoovie/{mid}")
     public Moovie getMoovieByID(@PathVariable Integer mid)
	{
		return mooviservice.getMoovieByID(mid);
		
	}
	
}
