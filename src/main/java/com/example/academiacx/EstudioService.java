package com.example.academiacx;

import com.example.academiacx.Estudio;
import com.example.academiacx.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudioService {

    @Autowired
    private EstudioRepository estudioRepository;

    public List<Estudio> getAllStudios(){
        return estudioRepository.findAll();
    }

    public Optional getStudioById(Long id){
        return estudioRepository.findById(id);
    }

    public Estudio saveStudio(Estudio estudio){
        return (Estudio) estudioRepository.save(estudio);
    }

    public Estudio updateStudio(Estudio estudio){
        return (Estudio) estudioRepository.save(estudio);
    }

    public void deleteStudio(Long id){
        estudioRepository.deleteById(id);
    }

}
