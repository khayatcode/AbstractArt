package com.project.test;

import java.util.ArrayList;
import java.util.Collections;

import com.project.abstracts.Art;
import com.project.models.Painting;
import com.project.models.Sculpture;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		
		Painting painting1 = new Painting("The Starry Night", "Vincent Van Gogh", "This is a painting of the night sky", "Oil on Canvas");
        Painting painting2 = new Painting("The Scream", "Edvard Munch", "This is a painting of a person screaming", "Oil on Canvas");
        Painting painting3 = new Painting("The Persistence of Memory", "Salvador Dali", "This is a painting of a melting clock", "Oil on Canvas");


        Sculpture sculpture1 = new Sculpture("The Thinker", "Auguste Rodin", "This is a sculpture of a person thinking", "Marble");
        Sculpture sculpture2 = new Sculpture("The Kiss", "Auguste Rodin", "This is a sculpture of a couple kissing", "Marble");
        
        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);
        
        Collections.shuffle(museum);
        
        for(Art artwork : museum) {
        	artwork.viewArt();
        }
        
        
        

	}

}
