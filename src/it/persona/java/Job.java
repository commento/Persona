package it.persona.java;

import it.persona.java.Job.Field;

public class Job {
	private Location location;
	private Field field;
	private String companyName;
	
	public enum Field {
		AUTOMOTIVE,
		TELECOMMUNICATION,
		IOT,
		FINANCE,
		PAYMENTS
	}

	public Job(Location location, Field field, String companyName) {
		this.location = location;
		this.field = field;
		this.companyName = companyName;
	}
}
