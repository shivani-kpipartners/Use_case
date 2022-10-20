package com.Assignment_20oct.Insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client_data")
public class Client_entity {
@Id 
@GeneratedValue(strategy = GenerationType.AUTO)
	private int Client_id;
	private String Client_name;
	private String Issue_date;
	private String Expiry_date;
	private int Medical_card_number;
	private String Gender;
	private int Age;
	private int Compensation_amount;
	private int Insurance_term;
	private String Insurance_type;
	public int getClient_id() {
		return Client_id;
	}
	public void setClient_id(int client_id) {
		Client_id = client_id;
	}
	public String getClient_name() {
		return Client_name;
	}
	public void setClient_name(String client_name) {
		Client_name = client_name;
	}
	public String getIssue_date() {
		return Issue_date;
	}
	public void setIssue_date(String issue_date) {
		Issue_date = issue_date;
	}
	public String getExpiry_date() {
		return Expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		Expiry_date = expiry_date;
	}
	public int getMedical_card_number() {
		return Medical_card_number;
	}
	public void setMedical_card_number(int medical_card_number) {
		Medical_card_number = medical_card_number;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getCompensation_amount() {
		return Compensation_amount;
	}
	public void setCompensation_amount(int compensation_amount) {
		Compensation_amount = compensation_amount;
	}
	public int getInsurance_term() {
		return Insurance_term;
	}
	public void setInsurance_term(int insurance_term) {
		Insurance_term = insurance_term;
	}
	public String getInsurance_type() {
		return Insurance_type;
	}
	public void setInsurance_type(String insurance_type) {
		Insurance_type = insurance_type;
	}
	
	
}
