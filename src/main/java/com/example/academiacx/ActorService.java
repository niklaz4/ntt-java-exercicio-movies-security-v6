package com.example.academiacx;

import com.example.academiacx.Ator;
import com.example.academiacx.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;
    public List<Ator> getAllActors(){
        return actorRepository.findAll();
    }

    public Ator getActorById(Long id){
        return actorRepository.findById(id).orElse(null);
    }

    public Ator saveActor(Ator ator){
        return actorRepository.save(ator);
    }

    public Ator updateActor(Ator ator){
        if(actorRepository.existsById(ator.getId())){
            return actorRepository.save(ator);
        } else {
            return null;
        }
    }

    public void deleteActor(Long id){
        actorRepository.deleteById(id);
    }
}
