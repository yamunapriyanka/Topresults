package com.revature.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "seed_degrees",uniqueConstraints = {
	    @UniqueConstraint(columnNames={"NAME"})})
public class SeedDegree {
	private SeedDegree(){
		
	}
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String name;
 

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