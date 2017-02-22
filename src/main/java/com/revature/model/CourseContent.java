package com.revature.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "course_contents",uniqueConstraints = {
	    @UniqueConstraint(columnNames={"COURSE_ID", "VIDEO_ID"}),
	    @UniqueConstraint(columnNames={"COURSE_ID", "TEXT_CONTENT"})
	})
public class CourseContent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "COURSE_ID")
	private Course courseId;
	@ManyToOne()
	@JoinColumn(name = "VIDEO_ID")
	private Video videoId;
	@Column(name = "TEXT_CONTENT")
	private String textContent;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Course getCourseId() {
		return courseId;
	}
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
	public Video getVideoId() {
		return videoId;
	}
	public void setVideoId(Video videoId) {
		this.videoId = videoId;
	}
	public String getTextContent() {
		return textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
}