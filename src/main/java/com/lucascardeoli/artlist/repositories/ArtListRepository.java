package com.lucascardeoli.artlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucascardeoli.artlist.entities.ArtList;

public interface ArtListRepository extends JpaRepository<ArtList, Long>{

}
