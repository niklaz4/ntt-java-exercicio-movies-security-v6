package com.example.academiacx;

import com.example.academiacx.Diretor;
import com.example.academiacx.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public List<Diretor> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Optional getDirectorById(Long id) {
        return directorRepository.findById(id);
    }

    public Diretor saveDirector(Diretor director) {
        return (Diretor) directorRepository.save(director);
    }

    public Object updateDirector(Diretor director) {
        return (Diretor) directorRepository.save(director);
    }

    public void deleteDirector(Long id){
        directorRepository.deleteById(id);
    }
}
