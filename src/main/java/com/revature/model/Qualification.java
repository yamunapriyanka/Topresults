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
@Table(name = "QUALIFICATIONS")
public class Qualification {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @ManyToOne()
 @JoinColumn(name = "DEGREE_ID")
 private Integer degreeid;
  @ManyToOne()
  @JoinColumn(name = "MAJOR_ID")
  private Integer majorid;
  private String university;
  private Float cgpa;
  @Column(name ="GRADUATION_MONTH")
  @Temporal(TemporalType.DATE)
 private Date graduationMonth;
  public Integer getDegreeid() {
	return degreeid;
}

public void setDegreeid(Integer degreeid) {
	this.degreeid = degreeid;
}

public Integer getMajorid() {
	return majorid;
}

public void setMajorid(Integer majorid) {
	this.majorid = majorid;
}

public String getUniversity() {
	return university;
}

public void setUniversity(String university) {
	this.university = university;
}

public Float getCgpa() {
	return cgpa;
}

public void setCgpa(Float cgpa) {
	this.cgpa = cgpa;
}

public Date getGraduationMonth() {
	return graduationMonth;
}

public void setGraduationMonth(Date graduationMonth) {
	this.graduationMonth = graduationMonth;
}



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

 
 



}
