package com.lucascardeoli.artlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucascardeoli.artlist.dto.ArtListDTO;
import com.lucascardeoli.artlist.entities.ArtList;
import com.lucascardeoli.artlist.repositories.ArtListRepository;

@Service
public class ArtListServices {

	@Autowired
	private ArtListRepository artListRepository;
	

	@Transactional(readOnly = true)
	public List<ArtListDTO> findAll(){
		List<ArtList> result = artListRepository.findAll();
		return result.stream().map(x-> new ArtListDTO(x)).toList();
	}
}
