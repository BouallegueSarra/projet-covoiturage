package tn.esen.entity;

import java.sql.Date;     

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="conducteur")
public class conducteur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_conducteur;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
		
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="date_naissance")
	private Date date_naissance;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="motpasse")
	private String motpasse;
	
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="permis")
	private String permis;
	/*
	 * @OneToMany(mappedBy="conducteur", fetch=FetchType.LAZY) private
	 * Collection<annonce> annonce;
	 */

	
	/*
	 * @OneToMany(mappedBy="conducteur", fetch=FetchType.LAZY) private
	 * Collection<voiture> voiture;
	 * 
	 */

	public Long getId_conducteur() {
	 	return id_conducteur;
	}




	public void setId_conducteur(Long id_conducteur) {
		this.id_conducteur = id_conducteur;
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




	public String getAdresse() {
		return adresse;
	}




	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getMotpasse() {
		return motpasse;
	}




	public void setMotpasse(String motpasse) {
		this.motpasse = motpasse;
	}




	public String getPermis() {
		return permis;
	}




	public void setPermis(String permis) {
		this.permis = permis;
	}



	/*
	 * public Collection<annonce> getAnnonce() { return annonce; }
	 * 
	 * 
	 * 
	 * 
	 * public void setAnnonce(Collection<annonce> annonce) { this.annonce = annonce;
	 * }
	 * 
	 */


	




	public Date getDate_naissance() {
		return date_naissance;
	}




	public String getTelephone() {
		return telephone;
	}




	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}




	@Override
	public String toString() {
		return "conducteur [id_conducteur=" + id_conducteur + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", genre=" + genre + ", email=" + email + ", motpasse=" + motpasse + ", permis=" + permis
				+ "]";
	}




	public conducteur() {
		super();
		// TODO Auto-generated constructor stub
	}




	public conducteur(String nom, String prenom, String adresse, String genre, Date date_naissance, String email,
			String motpasse, String telephone, String permis) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.genre = genre;
		this.date_naissance = date_naissance;
		this.email = email;
		this.motpasse = motpasse;
		this.telephone = telephone;
		this.permis = permis;
	}




	


	








	

	
}
