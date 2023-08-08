package com.param.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}


	public List<Address> getAdress() {
		return adress;
	}


	public void setAdress(List<Address> adress) {
		this.adress = adress;
	}


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private Double empSalary;
	
	
	//if one employee can have multiple addresss then association comes into the picture....
	
	@OneToMany (mappedBy="emp", cascade=CascadeType.ALL , fetch= FetchType.EAGER)
	private List<Address> adress;
	

}
