package com.example.academiacx;

import com.example.academiacx.Filme;
import com.example.academiacx.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> findAll(){
        return filmeRepository.findAll();
    }

    public Filme findById (Long id){
        Optional<Filme> filmeOptional = filmeRepository.findById(id);
        return filmeOptional.orElse(null);
    }

    public Filme create (Filme filme){
        return filmeRepository.save(filme);
    }

    public Filme update(Long id, Filme filme){
        return filmeRepository.findById(id)
                .map(filmeExistente -> {
                    // Atualizar os atributos do filme existente
                    filmeExistente.setTitulo(filme.getTitulo());
                    // ... (Atualizar outros atributos)
                    return filmeRepository.save(filmeExistente);
                })
                .orElse(null);
    }

    public void delete(Long id) {
        filmeRepository.deleteById(id);
    }
}
