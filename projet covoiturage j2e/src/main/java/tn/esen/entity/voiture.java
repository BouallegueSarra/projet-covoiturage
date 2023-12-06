package tn.esen.entity;


import java.sql.Date; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="voiture")

public class voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="marque")
	private String marque;
	
	@Column(name="modele")
	private String modele;
	
	@Column(name="plaque_immatriculation")
	private String plaque_immatriculation;
	
	@Column(name="date_immatriculation")
	private Date date_immatriculation;
	
	@Column(name="type")
	private String type;
	
	@Column(name="couleur")
	private String couleur;
	
	@Column(name="nbplace")
	private int nbplace;


	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="id_conducteur") private conducteur conducteur;
	 */


	public String getMarque() {
		return marque;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getPlaque_immatriculation() {
		return plaque_immatriculation;
	}

	public void setPlaque_immatriculation(String plaque_immatriculation) {
		this.plaque_immatriculation = plaque_immatriculation;
	}

	public Date getDate_immatriculation() {
		return date_immatriculation;
	}

	public void setDate_immatriculation(Date date_immatriculation) {
		this.date_immatriculation = date_immatriculation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNbplace() {
		return nbplace;
	}

	public void setNbplace(int nbplace) {
		this.nbplace = nbplace;
	}




	public voiture(String marque, String modele, String plaque_immatriculation, Date date_immatriculation, String type,
			String couleur, int nbplace) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.plaque_immatriculation = plaque_immatriculation;
		this.date_immatriculation = date_immatriculation;
		this.type = type;
		this.couleur = couleur;
		this.nbplace = nbplace;
	}

	

	@Override
	public String toString() {
		return "voiture [id=" + id + ", marque=" + marque + ", modele=" + modele + ", plaque_immatriculation="
				+ plaque_immatriculation + ", date_immatriculation=" + date_immatriculation + ", type=" + type
				+ ", couleur=" + couleur + ", nbplace=" + nbplace + "]";
	}

	public voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	/*
	 * public conducteur getConducteur() { return conducteur; }
	 * 
	 * public void setConducteur(conducteur conducteur) { this.conducteur =
	 * conducteur; }
	 */

	
	
	
	
	
	
	
}
