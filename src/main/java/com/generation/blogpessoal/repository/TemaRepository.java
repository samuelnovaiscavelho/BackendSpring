package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	
	//SELECT * FROM tb_temass WHERE descricao LIKE "%descricao%";
	public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
