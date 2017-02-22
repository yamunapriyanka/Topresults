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
	@Table(name = "student_courses")
	public class Course {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		
	
		private String title;
		private String description;
		 
		 @ManyToOne()
		 @JoinColumn(name ="CATEGORY_ID")
		private Category categoryid;
		 @Column(name = "ENROLLMENT_POINTS")
		private	Integer enrollmentpoints;
		
		 @Column(name = "COMPLETION_POINTS")
			private	Integer completionpoints;
		 
		 @Column(name = "IS_ACTIVE")
			private	boolean isactive;
		 
		 
		 
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

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Category getCategoryid() {
				return categoryid;
			}

			public void setCategoryid(Category categoryid) {
				this.categoryid = categoryid;
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

			public boolean isIsactive() {
				return isactive;
			}

			public void setIsactive(boolean isactive) {
				this.isactive = isactive;
			}

		 
	}
		