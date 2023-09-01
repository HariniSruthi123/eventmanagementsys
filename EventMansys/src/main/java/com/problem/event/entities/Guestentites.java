package com.problem.event.entities;
//chief guest//
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Guestentites {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String Name;
 private int age;
 private String emailid;
 private String gender;
 private String phoneno;
 private int vehicleno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public int getVehicleno() {
	return vehicleno;
}
public void setVehicleno(int vehicleno) {
	this.vehicleno = vehicleno;
}
public Guestentites(int id, String name, int age, String emailid, String gender, String phoneno, int vehicleno) {
	super();
	this.id = id;
	Name = name;
	this.age = age;
	this.emailid = emailid;
	this.gender = gender;
	this.phoneno = phoneno;
	this.vehicleno = vehicleno;
}
public Guestentites() {
	super();
}
 
}
