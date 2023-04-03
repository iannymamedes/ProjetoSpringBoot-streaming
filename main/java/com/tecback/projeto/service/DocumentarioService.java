package com.tecback.projeto.service;

import com.tecback.projeto.model.Documentario;
import com.tecback.projeto.model.Genero;
import com.tecback.projeto.repository.DocumentarioRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class DocumentarioService {

    @Autowired
    public DocumentarioRepository repository;

    public Documentario salvar(Documentario doc) {
        return repository.save(doc);
    }

    public Documentario alterar(Documentario doc) {
        if (Objects.nonNull(doc.getId())) {
            doc = repository.save(doc);
        } else {
            throw new NotFoundException();
        }
        return doc;
    }

    public List<Documentario> listar() {
        return repository.findAll();
    }

    public Boolean excluir(Integer id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            log.info("Erro ao realizar a exclusao : {}", e);
            return false;
        }
        return true;
    }

    public Documentario consultarPorId(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);

    }
}
