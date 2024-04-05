package com.example.academiacx;

import com.example.academiacx.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Diretor, Long> {
}
