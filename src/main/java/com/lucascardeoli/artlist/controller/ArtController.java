package com.lucascardeoli.artlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucascardeoli.artlist.dto.ArtMinDTO;
import com.lucascardeoli.artlist.services.ArtServices;

@RestController
@RequestMapping(value = "/arts")

public class ArtController {

	@Autowired
	private ArtServices artServices;
	
	@GetMapping
	public List<ArtMinDTO> findAll(){
	List<ArtMinDTO> result = artServices.findAll();
	return result;
	}
	
}
