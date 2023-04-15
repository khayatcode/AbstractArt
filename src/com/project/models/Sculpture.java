package com.project.models;

import com.project.abstracts.Art;

public class Sculpture extends Art {
	
	private String meterial;
	
	

	public Sculpture(String title, String author, String description, String meterial) {
		super(title, author, description);
		this.meterial = meterial;
	}



	public String getMeterial() {
		return meterial;
	}



	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}



	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		
		System.out.println("\nTitle: " + super.getTitle());
		System.out.println("Author: " + super.getAuthor());
		System.out.println("Description: " + super.getDescription());
		System.out.println("Meterial Type: " + this.meterial);

	}

}
