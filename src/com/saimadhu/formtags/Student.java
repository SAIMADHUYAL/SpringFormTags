package com.saimadhu.formtags;


public class Student {

	private String firstName;
	private String lastName;
	private String Country;
	private String fav_language;
	private String[] operatingSystems;
	public Student() {
		
	}
	
	
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


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	public String getFav_language() {
		return fav_language;
	}


	public void setFav_language(String fav_language) {
		this.fav_language = fav_language;
	}

	
	
}
