package com.example.academiacx;

import com.example.academiacx.Genero;
import com.example.academiacx.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> getAllGenres(){
        return generoRepository.findAll();
    }

    public Genero getGenreById(Long id){
        return generoRepository.findAllById(id);
    }

    public Genero saveGenre(Genero genre){
        return (Genero) generoRepository.save(genre);
    }

    public Genero updateGenre(Genero genre){
        return (Genero) generoRepository.save(genre);
    }

    public void deleteGenre(Long id){
        generoRepository.deleteById(id);
    }
}
