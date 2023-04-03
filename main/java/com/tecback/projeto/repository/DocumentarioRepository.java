package com.tecback.projeto.repository;


import com.tecback.projeto.model.Documentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentarioRepository extends JpaRepository<Documentario, Integer> {
}
