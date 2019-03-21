package shapesPractice;

import processing.core.PApplet;

public class ShapePractice extends PApplet {
	
	public void settings () {
		
		size(600, 600);
		
	}
	
	public void draw () {
		
		background(255);
		ellipseMode(CENTER);
		ellipse(300, 300, 500, 500);
		fill(255, 255, 255);
		ellipse(230, 230, 100, 100);
		fill(255, 255, 255);
		ellipse(430, 230, 100, 100);
		fill(253, 221, 202);
		curve(600, 100, 200, 350, 400, 350, 100, 100);
		line(300, 550, 300, 580);
		line(300, 580, 320, 600);
		line(300, 580, 280, 600);
		line(250, 560, 350, 560);
		
	}
	
	public static void main(String[] args) {
		
		String[] appletArgs = new String[] {"shapesPractice.ShapePractice"};
		PApplet.main(appletArgs);

	}

}
