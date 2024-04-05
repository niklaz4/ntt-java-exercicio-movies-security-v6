package com.example.academiacx;

import com.example.academiacx.Streaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamingRepository extends JpaRepository <Streaming, Long>{
    Object findAllById(Long id);
}
