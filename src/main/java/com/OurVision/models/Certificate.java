package com.OurVision.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="certificate")
public class Certificate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1, message="Please provide a name")
	private String first_name;
	
	@Size(min=1, message="Please provide a father name")
	private String father_name;
	
	@Size(min=1, message="Please provide a grandfather name")
	private String grandfather_name;
	
	@Size(min=1, message="Please provide a family name")
	private String family_name;
	
	@Size(min=1, message="Please provide a mother fullname")
	private String mother_fullname;
	
	@Size(min=1, message="Please provide a father nationality")
	private String father_nationality;
	
	@Size(min=1, message="Please provide a mother nationality")
	private String mother_nationality;
	
	@Size(min=1, message="Please provide a sex")
	private String sex;
	
	@Size(min=8, message="Please provide a Religion")
	private String Religion;
	
	@Size(min=8, message="Please provide a ID number")
	private String id_number;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date date_of_birth;
	
	
	@Size(min=2, message="Please provide a place of birth")
	private String place_of_birth;
	
	
	@Size(min=2, message="Please provide a hospital")
	private String hospital;
	
	
	@Size(min=2, message="Please provide addres")
	private String addres;
	
	
	
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

	public Certificate() {
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

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getMother_fullname() {
		return mother_fullname;
	}

	public void setMother_fullname(String mother_fullname) {
		this.mother_fullname = mother_fullname;
	}

	public String getFather_nationality() {
		return father_nationality;
	}

	public void setFather_nationality(String father_nationality) {
		this.father_nationality = father_nationality;
	}

	public String getMother_nationality() {
		return mother_nationality;
	}

	public void setMother_nationality(String mother_nationality) {
		this.mother_nationality = mother_nationality;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getReligion() {
		return Religion;
	}

	public void setReligion(String religion) {
		Religion = religion;
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

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
}
