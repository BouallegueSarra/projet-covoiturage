package tn.esen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esen.entity.voiture;

public interface voitureRepository extends JpaRepository<voiture, Long> {

}
