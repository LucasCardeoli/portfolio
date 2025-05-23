package com.lucascardeoli.artlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucascardeoli.artlist.dto.ArtListDTO;
import com.lucascardeoli.artlist.services.ArtListServices;

@RestController
@RequestMapping(value = "/lists")

public class ArtListController {

	@Autowired
	private ArtListServices artListServices;

	
	@GetMapping
	public List<ArtListDTO> findAll(){
	List<ArtListDTO> result = artListServices.findAll();
	return result;
	}
	
}
