package com.example.demo.dao;

import com.example.demo.entity.Retenue_four;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface RetenuFourRepository extends JpaRepository<Retenue_four, Long> {
    Optional<Retenue_four> findByFrtMatcinAndFrtClepatAndFrtMoisAndFrtAnnee(Long frtMatcin, String frtClepat, Integer frtMois, Integer frtAnnee);
    Optional<Retenue_four> findByFrtMatcinAndFrtMoisAndFrtAnnee(Long frtMatcin, Integer frtMois, Integer frtAnnee);
}
