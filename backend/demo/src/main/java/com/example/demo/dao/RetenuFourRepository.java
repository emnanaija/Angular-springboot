package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Retenue_four;

import java.util.List;

@Repository
public interface RetenuFourRepository extends JpaRepository<Retenue_four, Long> {
    List<Retenue_four> findByFrtTypIdent(Integer frtTypIdent);
}
