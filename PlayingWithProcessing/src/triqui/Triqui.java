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
	public int width = 400, heigth = 400;

	public void settings () {
		size(width, heigth);
	}
	
	public void draw () {
		
		background(100);
		
		for(int i = 0; i < 3; i++) 
			for(int j = 0; j < 3; j++)
				rect(j*(width/3), i*(heigth/3), width/3, heigth/3);
		
		if(mousePressed) {
			
			int xPosition = (int) (map(mouseX, 0, width, 0, 3));
			int yPosition = (int) (map(mouseY, 0, heigth, 0, 3));
			
			System.out.println(xPosition);
			System.out.println(yPosition);
			
			Triqui.board[yPosition][xPosition] = 1;
			
		}
		
		for(int i = 0; i < 3; i++) 
			for(int j = 0; j < 3; j++) {
				if(Triqui.board[i][j] == 1) {
					line(j*(width/3), i*(heigth/3), (j+1)*(width/3), (i+1)*(heigth/3));
					line((j+1)*(width/3), i*(heigth/3), j*(width/3), (i+1)*(heigth/3));
				} else
					if(Triqui.board[i][j] == 2){
						ellipseMode(CORNERS);
						ellipse(j*(width/3), i*(heigth/3), (j+1)*(width/3), (i+1)*(heigth/3));
					}
			}
	}
	
	public static void main(String[] args) {
			
		String[] appletArgs = new String[] {"triqui.Triqui"};
		PApplet.main(appletArgs);
	
	}

}
