package com.OurVision.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="new_id")
public class NewId {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1, message="Please provide a first name")
	private String first_name;
	
	@Size(min=1, message="Please provide a father name")
	private String father_name;
	
	@Size(min=1, message="Please provide a grandfather name")
	private String grandfather_name;
	
	@Size(min=1, message="Please provide a mother name")
	private String mother_name;
	
	@Size(min=1, message="Please provide a family name")
	private String family_name;
	
	@Size(min=8, message="Please provide a ID number")
	private String id_number;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date date_of_birth;
	
	
	@Size(min=2, message="Please provide a place of birth")
	private String place_of_birth;
	
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String personal_image;
	
	
	
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

	public NewId() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getGrandfather_name() {
		return grandfather_name;
	}

	public void setGrandfather_name(String grandfather_name) {
		this.grandfather_name = grandfather_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	public String getPersonal_image() {
		return personal_image;
	}

	public void setPersonal_image(String personal_image) {
		this.personal_image = personal_image;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
