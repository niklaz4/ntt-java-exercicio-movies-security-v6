package com.example.academiacx;

import com.example.academiacx.Franquia;
import com.example.academiacx.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FranquiaService {

    @Autowired
    private FranquiaRepository franquiaRepository;

    public List<Franquia> getAllFranchises(){
        return franquiaRepository.findAll();
    }

    public Optional getFranchiseById(Long id){
        return franquiaRepository.findById(id);
    }

    public Franquia saveFranchise(Franquia franchise){
        return (Franquia) franquiaRepository.save(franchise);
    }

    public Franquia updateFranchise(Franquia franchise){
        return (Franquia) franquiaRepository.save(franchise);
    }

    public void deleteFranchise(Long id){
        franquiaRepository.deleteById(id);
    }
}
