package triqui;

import processing.core.PApplet;

public class Triqui extends PApplet {
	
	public class Logic {
		
		public int board [][];
		
		public Logic() {
			this.board = new int [3][3];
		}		
	}
	
	Logic Triqui = new Logic();

	public void settings () {
		size(400,400);
	}
	
	public void draw () {
		
		background(100);
		
		rect(0, 0, 400/3, 400/3);
		
		rect(400/3, 0, 400/3, 400/3);
		
		rect((400/3)*2, 0, 400/3, 400/3);
		
		rect(0, 400/3, 400/3, 400/3);
		
		rect(400/3, 400/3, 400/3, 400/3);
		
		rect((400/3)*2, 400/3, 400/3, 400/3);
		
		rect(0, (400/3)*2, 400/3, 400/3);
		
		rect(400/3, (400/3)*2, 400/3, 400/3);
		
		rect((400/3)*2, (400/3)*2, 400/3, 400/3);
	}
	
	public static void main(String[] args) {
			
		String[] appletArgs = new String[] {"triqui.Triqui"};
		PApplet.main(appletArgs);
	
	}

}
