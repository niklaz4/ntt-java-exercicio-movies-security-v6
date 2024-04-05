package com.example.academiacx;

import com.example.academiacx.StreamingRepository;
import com.example.academiacx.Streaming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamingService {

    @Autowired
    private StreamingRepository streamingRepository;

    public List<Streaming> getAllStreamings(){
        return streamingRepository.findAll();
    }

    public Streaming getStreamingById(Long id){

        return (Streaming) streamingRepository.findAllById(id);
    }

    public Streaming saveStreaming(Streaming streaming){
        return (Streaming) streamingRepository.save(streaming);
    }

    public Streaming updateStreaming(Streaming streaming){
        return (Streaming) streamingRepository.save(streaming);
    }

    public void deleteStreaming(Long id){

        streamingRepository.deleteById(id);
    }
}
