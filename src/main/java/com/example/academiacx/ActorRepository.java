package com.example.academiacx;

import com.example.academiacx.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Ator, Long> {
}
