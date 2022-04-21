package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Feriado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeriadoRepository extends JpaRepository<Feriado, Integer> {
}
