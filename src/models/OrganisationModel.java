package models;

import lombok.Data;

public @Data class OrganisationModel {

	private String name;
	private double budget;
	private String address;
	private String city;
	
	@Override
	public String toString() {
		return this.name;
	}
}
