package com.seunome.crudestudante.service;

import com.seunome.crudestudante.repository.Estudante;
import com.seunome.crudestudante.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudanteService {


    @Autowired
    public EstudanteRepository repository;


    private Estudante salvar(EstudanteService estudante) {
    }
    public Estudante salvar(Estudante estudante) {
        return repository.save(estudante);
    }

    public List<Estudante> listarTodos() {
        return repository.findAll();
    }

    public Estudante buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
