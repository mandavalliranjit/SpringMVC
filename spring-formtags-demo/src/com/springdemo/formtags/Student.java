package com.springdemo.formtags;

import java.util.LinkedHashMap;


public class Student {
	String firstName;
	String lastName;
	String country;
	String city;
	String favoriteLanguage;
	String operatingOS;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> osItemList;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States Of America");
		countryOptions.put("FR", "France");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("GR", "Germany");
		
		osItemList = new LinkedHashMap<>();
		osItemList.put("Win", "Windows OS");
		osItemList.put("Linux", "Linux OS");
		osItemList.put("Mac", "Mac OS");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getOperatingOS() {
		return operatingOS;
	}

	public void setOperatingOS(String operatingOS) {
		this.operatingOS = operatingOS;
	}

	public LinkedHashMap<String, String> getOsItemList() {
		return osItemList;
	}

}
