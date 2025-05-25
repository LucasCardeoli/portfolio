package com.lucascardeoli.artlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lucascardeoli.artlist.entities.ArtList;

public interface ArtListRepository extends JpaRepository<ArtList, Long>{

	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND art_id = :artId")
	void updateBelongingPosition(Long listId, Long artId, Integer newPosition);
}
