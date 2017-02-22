package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
 
public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
}
private String title;
  private String decription;
  @ManyToOne()
	 @JoinColumn(name ="CATEGORY_ID")
	private Category categoryid;
  
  @ManyToOne()
	 @JoinColumn(name ="MENTOR_ID")
	private Mentor mentorid;
  
  
  @ManyToOne()
	 @JoinColumn(name ="TEASOR_VIDEO_ID")
	private Video videoid;
  
  @Column(name = "ENROLLMENT_POINTS")
	private	Integer enrollmentpoints;
	
	 @Column(name = "COMPLETION_POINTS")
		private	Integer completionpoints;
  @Column(name = "IS_ACTIVE")
  private Boolean isActive;
  
  
  
  
  
  public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public Category getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Category categoryid) {
		this.categoryid = categoryid;
	}
	public Mentor getMentorid() {
		return mentorid;
	}
	public void setMentorid(Mentor mentorid) {
		this.mentorid = mentorid;
	}
	public Video getVideoid() {
		return videoid;
	}
	public void setVideoid(Video videoid) {
		this.videoid = videoid;
	}
	public Integer getEnrollmentpoints() {
		return enrollmentpoints;
	}
	public void setEnrollmentpoints(Integer enrollmentpoints) {
		this.enrollmentpoints = enrollmentpoints;
	}
	public Integer getCompletionpoints() {
		return completionpoints;
	}
	public void setCompletionpoints(Integer completionpoints) {
		this.completionpoints = completionpoints;
	}
	public Boolean getIsActive() {
		return isActive;
	}
}