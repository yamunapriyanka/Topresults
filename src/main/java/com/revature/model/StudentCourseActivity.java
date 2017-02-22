


	package com.revature.model;

	import java.time.LocalTime;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "STUDENT_COURSE_ACTIVITIES")
	public class StudentCourseActivity {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  @ManyToOne()
	  @JoinColumn(name="STUDENT_COURSE_ID")
	  private Integer studentCourseId;
	  @ManyToOne()
	  @JoinColumn(name="STUDENT_COURSE_ID")
	  private Integer courseContentId;
	  @Column(name = "STARTED_ON")
		private LocalTime startedOn;
		 @Column(name = "COMPLETED_ON")
		private LocalTime completedOn;
	  @ManyToOne()
		@JoinColumn(name = "STATUS")
		private SeedStatus status;
		
	 

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	public Integer getStudentCourseId() {
		return studentCourseId;
	}

	public void setStudentCourseId(Integer studentCourseId) {
		this.studentCourseId = studentCourseId;
	}

	public Integer getCourseContentId() {
		return courseContentId;
	}

	public void setCourseContentId(Integer courseContentId) {
		this.courseContentId = courseContentId;
	}

	public LocalTime getStartedOn() {
		return startedOn;
	}

	public void setStartedOn(LocalTime startedOn) {
		this.startedOn = startedOn;
	}

	public LocalTime getCompletedOn() {
		return completedOn;
	}

	public void setCompletedOn(LocalTime completedOn) {
		this.completedOn = completedOn;
	}

	public SeedStatus getStatus() {
		return status;
	}

	public void setStatus(SeedStatus status) {
		this.status = status;
	}

	

	 



	}

