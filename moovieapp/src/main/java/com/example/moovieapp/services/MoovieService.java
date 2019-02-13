package com.example.moovieapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moovieapp.dao.MoovieDao;
import com.example.moovieapp.entities.Moovie;

@Service
public class MoovieService {

	@Autowired
	MoovieDao mooviedao;
	public Moovie getMoovieByID(Integer id)
	{
		return mooviedao.findOne(id);
		
	}
	
}
