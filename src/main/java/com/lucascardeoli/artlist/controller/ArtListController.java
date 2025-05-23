package com.lucascardeoli.artlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucascardeoli.artlist.dto.ArtListDTO;
import com.lucascardeoli.artlist.dto.ArtMinDTO;
import com.lucascardeoli.artlist.services.ArtListServices;
import com.lucascardeoli.artlist.services.ArtServices;

@RestController
@RequestMapping(value = "/lists")

public class ArtListController {

	@Autowired
	private ArtListServices artListServices;
	
	@Autowired
	private ArtServices artServices;

	
	@GetMapping
	public List<ArtListDTO> findAll(){
	List<ArtListDTO> result = artListServices.findAll();
	return result;
	}
	
	@GetMapping(value ="/{listId}/arts")
	public List<ArtMinDTO> findByList( @PathVariable Long listId){
	List<ArtMinDTO> result = artServices.findByList(listId);
	return result;
	}
	
}
