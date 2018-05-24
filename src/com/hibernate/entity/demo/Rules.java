package com.hibernate.entity.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// The two annotation below is how Java Class maps to the table

@Entity
@Table(name="rules")
public class Rules {
    
	
	// The two annotation below Id and Column maps the database fields to the DB columns
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="type_rec")
	private String typeRec;
	
	@Column(name="customer_id")
	private String CustomerId;
	
	// A no-argument constructor
    public  Rules() {
   	 
    }
   
  

    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTypeRec() {
		return typeRec;
	}


	public void setTypeRec(String typeRec) {
		this.typeRec = typeRec;
	}


	public String getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}


public Rules(String typeRec, String customerId) {
		super();
		this.typeRec = typeRec;
		CustomerId = customerId;
	}


@Override
public String toString() {
	return "Rules [id=" + id + ", typeRec=" + typeRec + ", CustomerId=" + CustomerId + ", getId()=" + getId()
			+ ", getTypeRec()=" + getTypeRec() + ", getCustomerId()=" + getCustomerId() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
     
     
}