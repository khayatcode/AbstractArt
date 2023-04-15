package com.project.models;

import com.project.abstracts.Art;

public class Painting extends Art {
	
	private String paintType;
	

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	
	public String getPaintType() {
		return paintType;
	}


	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}


	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		
		System.out.println("\nTitle: " + super.getTitle());
		System.out.println("Author: " + super.getAuthor());
		System.out.println("Description: " + super.getDescription());
		System.out.println("Paint Type: " + this.paintType);

	}

}
