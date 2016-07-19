package com.HomeDecor.UserModel;

import java.io.Serializable;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.jboss.logging.Message;

@Entity
public class User implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	
	private boolean Active=true;
	private int Role=1 ;
	
	
	private String name;
	
	@Transient
	private String ConfirmPassword;
	
	
	private String Contactno;
	
	private String Address;
	
	private String username;
	private String email;
	private String Password;
	
	
	
	@NotEmpty(message = "Username is mandatory field")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@NotEmpty(message = "E-mail is mandatory field")
	@Pattern(regexp=".+@.+\\..+",message="Wrong Email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotEmpty(message = "Password is mandatory field")
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@NotEmpty(message = "Confirm Password is mandatory field")
	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	@NotEmpty(message = "ContactNo. is mandatory field")
	public String getContactno() {
		return Contactno;
	}

	public void setContactno(String contactno) {
		Contactno = contactno;
	}

	@NotEmpty(message = "Address is mandatory field")
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	
	@NotNull(message = "UserId is mandatory field")
	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	@NotEmpty(message = "Name is mandatory field")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}

	public int getRole() {
		return Role;
	}

	public void setRole(int role) {
		Role = role;
	}	

}
