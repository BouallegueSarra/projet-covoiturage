package tn.esen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esen.entity.annonce;

public interface annonceRepository extends JpaRepository<annonce, Long> {

}
