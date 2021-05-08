package eTicaretKayýtGiris.entities.concretes;

import eTicaretKayýtGiris.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	public User () {}

	public User(int id, String firtsName, String lastName, String password,String eMail) {
		super();
		this.id = id;
		this.firstName = firtsName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String firstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
