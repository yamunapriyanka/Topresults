package com.revature.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "certifications", uniqueConstraints = { @UniqueConstraint(columnNames = { "NAME" }) })
public class Certification {
	private Certification(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	@Column(name = "ISSUED_ON")
	@Temporal(TemporalType.DATE)
	private Date issuedOn;

	public Date getIssuedOn() {
		return issuedOn;
	}

	public void setIssuedOn(Date issuedOn) {
		this.issuedOn = issuedOn;
	}

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

}