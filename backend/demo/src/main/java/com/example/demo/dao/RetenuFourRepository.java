package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Retenue_four;

import java.util.Optional;

@Repository
public interface RetenuFourRepository extends JpaRepository<Retenue_four, Long> {
    Optional<Retenue_four> findByFrtMatcinAndFrtClepatAndFrtMoisAndFrtAnnee(Long frtMatcin, String frtClepat, Integer frtMois, Integer frtAnnee);
}
