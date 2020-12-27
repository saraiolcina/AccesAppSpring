package com.homeownersacces.app.entity;

import java.io.*;
import javax.persistence.*;

@Entity
@Table(name= "users")
public class User implements Serializable{
	
	private static final long serialVersionUID = 2125210248764258879L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=50)
	private String name;
	
	@Column(name="mobile", nullable=false, length=50, unique=true)
	private Long phone;
	
	@Column(length=50)
	private String address;
	
	private boolean enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}	
	
}
