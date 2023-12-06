package tn.esen.entity;

import java.sql.Date; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="contact")
public class contact {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contact;	

	@Column(name="nom")
	private String nom;
	

	@Column(name="prenom")
	private String prenom;
	
	@Column(name="email")
	private String email;
		
	@Column(name="message")
	private String message;

	public Long getId_contact() {
		return id_contact;
	}

	public void setId_contact(Long id_contact) {
		this.id_contact = id_contact;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public contact(String nom, String prenom, String email, String message) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.message = message;
	}

	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
