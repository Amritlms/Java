package com.javadevjournal.restexample.data;

public class Registration {

 private String firstName;
 private String lastName;
 private String email;
private long mobilenumber;
 private String usertype;
 private String address;
 private String pan;
 private String adhar;
 private String city;
 private String state;
 private String shopname;
 private String username;
 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }
 public void setMobileNumber(long mobilenumber) {
	  this.mobilenumber = mobilenumber;
	 }

 public long getMobileNumber() {
  return mobilenumber;
 }

 public void setType(String usertype) {
  this.usertype = usertype;
 }

 public String getType() {
  return usertype;
 }
 public void setadress(String address) {
	  this.address = address;
	 }
 public String getadress() {
	  return address;
	 }
 public void setpan(String pan) {
	  this.pan = pan;
	 }
 public String getpan() {
	  return pan;
	 }
 public void setadhar(String adhar) {
	  this.adhar = adhar;
	 }
public String getadhar() {
	  return adhar;
	 }
public void setcity(String city) {
	  this.city = city;
	 }
public String getcity() {
	  return city;
	 }
public void setstate(String state) {
	  this.state = state;
	 }
public String getstate() {
	  return state;
	 }
public void setshopname(String shopname) {
	  this.shopname = shopname;
	 }
public String getshopname() {
	  return shopname;
	 }
public void setusername(String username) {
	  this.username = username;
	 }
public String getusername() {
	  return username;
	 }
}