package tn.esen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esen.entity.contact;

public interface contactRepository extends JpaRepository<contact, Long> {

}
