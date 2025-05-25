package com.lucascardeoli.artlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucascardeoli.artlist.dto.ArtListDTO;
import com.lucascardeoli.artlist.entities.ArtList;
import com.lucascardeoli.artlist.projections.ArtMinProjection;
import com.lucascardeoli.artlist.repositories.ArtListRepository;
import com.lucascardeoli.artlist.repositories.ArtRepository;

@Service
public class ArtListServices {

	@Autowired
	private ArtListRepository artListRepository;
	
	@Autowired
	private ArtRepository artRepository;
	

	@Transactional(readOnly = true)
	public List<ArtListDTO> findAll(){
		List<ArtList> result = artListRepository.findAll();
		return result.stream().map(x-> new ArtListDTO(x)).toList();
	}
	
	@Transactional
	public void move(Long ListId, int sourceIndex, int destinationIndex) {
		List<ArtMinProjection> list = artRepository.searchByList(ListId);
		
		ArtMinProjection obj = list.remove(sourceIndex);
		list.add(obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; i <=max;i++) {
			
			artListRepository.updateBelongingPosition(ListId, list.get(i).getId(), i);
			
			}
		}
}
