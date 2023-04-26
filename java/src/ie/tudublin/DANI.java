package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;

public class DANI extends PApplet {

	// write a method called loadFile that loads the document into the model from
	// small.txt
	public void loadFile() {

		sonnet = loadStrings("small.txt"); // Load a text file into a string array
		for (int i = 0; i < 14 ; i++) {
			line = sonnet[i]; 
			String[] words = split(line, " "); // Split a string into an array of words
			for (int j = 0; j < words.length; j++) {
				w = words[j]; 
				w = w.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
				w.toLowerCase(); // Convert a string to lower case 
			}
		}
	}

	// write a method called findWord(str) that finds a word in the model and checks if it already exists
	public Object findWord(String str) {
		for (int i = 0; i < 14; i++) {
			line = sonnet[i];
			String[] words = split(line, " ");
			for (int j = 0; j < words.length; j++) {
				w = words[j];
				w = w.replaceAll("[^\\w\\s]", "");
				w.toLowerCase();
				if (w.equals(str)) {
					return w;
				}
				else return null;
				
			}
		}
		return w;
	}

	

	public void settings() {
		size(1000, 1000);
		// fullScreen(SPAN);
	}

	String[] sonnet;
	String line;
	String w;

	public String[] writeSonnet() {
		return null;
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
		textAlign(CENTER, CENTER);

	}
}
