package com.uploading.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rawdata")

public class RawdataF {
	
	@Id
	private Integer id;
	private String Name;
	private String NetWorth;
	private Double Age;
	private String CountryandTerritory;
	private String Source;
	private String Industry;
	public RawdataF(Integer id, String name, String netWorth, Double age, String countryandTerritory, String source,
			String industry) {
		
		this.id = id;
		Name = name;
		NetWorth = netWorth;
		Age = age;
		CountryandTerritory = countryandTerritory;
		Source = source;
		Industry = industry;
	}
	public RawdataF() {
		super();
	}
	public RawdataF(String name, String netWorth, Double age, String countryandTerritory, String source,
			String industry) {
		super();
		Name = name;
		NetWorth = netWorth;
		Age = age;
		CountryandTerritory = countryandTerritory;
		Source = source;
		Industry = industry;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNetWorth() {
		return NetWorth;
	}
	public void setNetWorth(String netWorth) {
		NetWorth = netWorth;
	}
	public Double getAge() {
		return Age;
	}
	public void setAge(Double age) {
		Age = age;
	}
	public String getCountryandTerritory() {
		return CountryandTerritory;
	}
	public void setCountryandTerritory(String countryandTerritory) {
		CountryandTerritory = countryandTerritory;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getIndustry() {
		return Industry;
	}
	public void setIndustry(String industry) {
		Industry = industry;
	}
	
	
}
