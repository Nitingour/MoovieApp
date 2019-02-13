package com.example.moovieapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.moovieapp.entities.Moovie;

public interface MoovieDao extends CrudRepository<Moovie, Integer>{

}
