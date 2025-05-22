package com.lucascardeoli.artlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucascardeoli.artlist.dto.ArtDTO;
import com.lucascardeoli.artlist.dto.ArtMinDTO;
import com.lucascardeoli.artlist.entities.Art;
import com.lucascardeoli.artlist.repositories.ArtRepository;

@Service
public class ArtServices {

	@Autowired
	private ArtRepository artRepository;
	
	
	@Transactional
	public ArtDTO findbyid(Long id) {
		Art result = artRepository.findById(id).get();
		return new ArtDTO(result);
	}
	@Transactional
	public List<ArtMinDTO> findAll(){
		List<Art> result = artRepository.findAll();
		return result.stream().map(x-> new ArtMinDTO(x)).toList();
	}
}
