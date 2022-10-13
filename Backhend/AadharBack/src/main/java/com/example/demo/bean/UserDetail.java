package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="userdetail")
public class UserDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dob;
	private String address;
	private String email;
	private long phone;
	private String gender;
	
	
	
	public UserDetail() {
		
	}
	public UserDetail(int id, String name, String dob, String address, String email, long phone, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", email=" + email
				+ ", phone=" + phone + ", gender=" + gender + "]";
	}
	
	

}

