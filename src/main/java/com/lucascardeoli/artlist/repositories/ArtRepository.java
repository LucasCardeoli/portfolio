package com.lucascardeoli.artlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucascardeoli.artlist.entities.Art;

public interface ArtRepository extends JpaRepository<Art, Long>{

}
