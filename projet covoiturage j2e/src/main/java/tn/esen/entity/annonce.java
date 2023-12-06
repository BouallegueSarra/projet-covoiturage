package tn.esen.entity;

import java.sql.Date; 


import javax.persistence.*;

@Entity
@Table(name="annonce")
public class annonce  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	

	@Column(name="prix")
	private double prix;
	

	@Column(name="nb_place")
	private int nb_place;
	
	@Column(name="type")
	private String type;
		
	@Column(name="date_depart")
	private Date date_depart;
	
	@Column(name="lieux_depart")
	private String lieux_depart;
	
	@Column(name="lieux_arrive")
	private String lieux_arrive;
	
	
	@Column(name="marqueVoiture")
	private String marqueVoiture;
 
	

	

	public annonce() {
		super();
		// TODO Auto-generated constructor stub
	}







	public annonce(double prix, int nb_place, String type, Date date_depart, String lieux_depart, String lieux_arrive,
			String marqueVoiture) {
		super();
		this.prix = prix;
		this.nb_place = nb_place;
		this.type = type;
		this.date_depart = date_depart;
		this.lieux_depart = lieux_depart;
		this.lieux_arrive = lieux_arrive;
		this.marqueVoiture = marqueVoiture;

	}












	public Long getId() {
		return id;
	}







	public void setId(Long id) {
		this.id = id;
	}







	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getNb_place() {
		return nb_place;
	}


	public void setNb_place(int nb_place) {
		this.nb_place = nb_place;
	}


	public Date getDate_depart() {
		return date_depart;
	}


	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}


	public String getLieux_depart() {
		return lieux_depart;
	}


	public void setLieux_depart(String lieux_depart) {
		this.lieux_depart = lieux_depart;
	}


	public String getLieux_arrive() {
		return lieux_arrive;
	}


	public void setLieux_arrive(String lieux_arrive) {
		this.lieux_arrive = lieux_arrive;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMarqueVoiture() {
		return marqueVoiture;
	}


	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}


	
	
	
	
	
	
	
}
