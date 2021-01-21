package com.OurVision.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="modify_passport")
public class ModifyPassport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1, message="Please provide a full name")
	private String full_name;
	
	@Size(min=8, message="Please provide a ID number")
	private String id_number;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date date_of_birth;
	
	
	@Size(min=2, message="Please provide a place of birth")
	private String place_of_birth;
	
	@Size(min=2, message="Please provide your sex")
	private String sex;
	
	@Size(min=2, message="Please provide your profission")
	private String profission;
	
	@Size(min=2, message="Please provide your type")
	private String type;
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String personal_image;
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String id_image;
	
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	@ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User citizen;

	
	public ModifyPassport() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getProfission() {
		return profission;
	}

	public void setProfission(String profission) {
		this.profission = profission;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getCitizen() {
		return citizen;
	}

	public void setCitizen(User citizen) {
		this.citizen = citizen;
	}
	
	
	public String getPersonal_image() {
		return personal_image;
	}

	public void setPersonal_image(String personal_image) {
		this.personal_image = personal_image;
	}

	public String getId_image() {
		return id_image;
	}

	public void setId_image(String id_image) {
		this.id_image = id_image;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	
}
