package com.esoft.societyadd.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Entity
@Table(name="BuildingDetails")

public class BuildingDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Building_Name")
	@NotEmpty
	private String buildingName;
	
	@PositiveOrZero
	@Column(name="TOT_HOUSE")
	private int totalhouse;
	
	@PositiveOrZero
	@Column(name="TOT_2BHK")
	private int tot_2bhk;
	
	@PositiveOrZero
	@Column(name="TOT_1BHK")
	private int tot_1bhk;
	
	@NotEmpty 
	@Column(name="ONE_BHKSIZE")
	private String onebhkSize;
	
	
	@NotEmpty
	@Column(name="TWO_BHKSIZE")
	private String twobhkSize;
	
	
	
	
	
	public int getId() {
		return id;
	}


	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public String getOnebhkSize() {
		return onebhkSize;
	}


	public void setOnebhkSize(String onebhkSize) {
		this.onebhkSize = onebhkSize;
	}


	public String getTwobhkSize() {
		return twobhkSize;
	}


	public void setTwobhkSize(String twobhkSize) {
		this.twobhkSize = twobhkSize;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTotalhouse() {
		return totalhouse;
	}


	public void setTotalhouse(int totalhouse) {
		this.totalhouse = totalhouse;
	}


	public int getTot_2bhk() {
		return tot_2bhk;
	}


	public void setTot_2bhk(int tot_2bhk) {
		this.tot_2bhk = tot_2bhk;
	}


	public int getTot_1bhk() {
		return tot_1bhk;
	}


	public void setTot_1bhk(int tot_1bhk) {
		this.tot_1bhk = tot_1bhk;
	}


	
	
	
	
	
	
	
	
	
	
	

}
