package com.problem.event.entities;
import java.sql.Date;
//import java.util.List;

//import jakarta.persistence.CascadeType;
//hihger officer in company
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;

@Entity
public class Administrentities {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String name;
 private int age;
 private String gender;
 private String posting;
 private String role;
 private long salary;
 private Date joindate;
// @OneToMany(cascade = CascadeType.ALL)
// private List<Cateringentities>catering;
// @OneToMany(cascade = CascadeType.ALL)      
//// private List<Organizerentities>organizer;
// @OneToMany(cascade =CascadeType.ALL)
// private List<Guestentites>guest;
 //@On
public Administrentities() {
	super();
	// TODO Auto-generated constructor stub
}
public Administrentities(int id, String name, int age, String gender, String posting, String role, long salary,
		Date joindate) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.posting = posting;
	this.role = role;
	this.salary = salary;
	this.joindate = joindate;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPosting() {
	return posting;
}
public void setPosting(String posting) {
	this.posting = posting;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public Date getJoindate() {
	return joindate;
}
public void setJoindate(Date joindate) {
	this.joindate = joindate;
}

 
}
