package com.lucascardeoli.artlist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lucascardeoli.artlist.entities.Art;
import com.lucascardeoli.artlist.projections.ArtMinProjection;

public interface ArtRepository extends JpaRepository<Art, Long>{

	@Query(nativeQuery = true, value = """
			SELECT tb_art.id, tb_art.title, tb_art.img_url AS imgUrl,
			tb_art.short_description AS shortDescription, tb_belonging.position
			FROM tb_art
			INNER JOIN tb_belonging ON tb_art.id = tb_belonging.art_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<ArtMinProjection> searchByList(Long listId);
}
