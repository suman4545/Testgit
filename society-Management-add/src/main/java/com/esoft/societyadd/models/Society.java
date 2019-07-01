package com.esoft.societyadd.models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="SOCIETY",uniqueConstraints= {@UniqueConstraint(columnNames="SOCIETY_REG")})
public class Society implements Serializable{
	
	public Society() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotEmpty
	@Column(name="name")
	private String societyName;
	
	@NotEmpty
	@Column(name="SOCIETY_REG")
	@NaturalId
   	private String societyRegNo;
	
	@NotEmpty
	@Column(name="SOCIETY_country")
	private String country;
	
	@NotEmpty
	@Column(name="SOCIETY_STATE")
	private String State;
	
	@NotEmpty
	@Column(name="SOCIETY_Address")
	private String address;
	
	 @OneToMany(targetEntity=BuildingDetails.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	 @JoinColumn(name="SOCIETY_REG",referencedColumnName="SOCIETY_REG")
	 @Valid
	private List<BuildingDetails> buildingDetails;
	
	
	
	
	

	public List<BuildingDetails> getBuildingDetails() {
		return buildingDetails;
	}

	public void setBuildingDetails(List<BuildingDetails> buildingDetails) {
		this.buildingDetails = buildingDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getSocietyRegNo() {
		return societyRegNo;
	}

	public void setSocietyRegNo(String societyRegNo) {
		this.societyRegNo = societyRegNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	

}
