package com.revature.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "REVTEK_STUDENTS")
public class RevtekStudent {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
private String name;
  @ManyToOne()
	@JoinColumn(name = "UNIVERSITY_ID")
	private SeedUniversisty universityid;
  @Column(name = "EMAIL_ID")
  private String emailid;
  
  @Column(name = "MOBILE_NUMBER")
  private Integer mobilenumber;
  
  @Column(name = "REGISTERED_ON")
  @Temporal(TemporalType.DATE)
 private Date registeredOn;
  @Column(name = "IS_ACTIVE")
  private Boolean isActive;
  
  
  public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SeedUniversisty getUniversityid() {
		return universityid;
	}
	public void setUniversityid(SeedUniversisty universityid) {
		this.universityid = universityid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Integer getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Date getRegisteredOn() {
		return registeredOn;
	}
	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
  
}