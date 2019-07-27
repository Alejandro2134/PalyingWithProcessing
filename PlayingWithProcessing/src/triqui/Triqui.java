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
		
		rect(0, 0, width/3, heigth/3);
		
		rect(400/3, 0, width/3, heigth/3);
		
		rect((400/3)*2, 0, width/3, heigth/3);
		
		rect(0, 400/3, width/3, heigth/3);
		
		rect(400/3, 400/3, width/3, heigth/3);
		
		rect((400/3)*2, 400/3, width/3, heigth/3);
		
		rect(0, (400/3)*2, width/3, heigth/3);
		
		rect(400/3, (400/3)*2, width/3, heigth/3);
		
		rect((400/3)*2, (400/3)*2, width/3, heigth/3);
		
		for(int i = 0; i < 3; i++) 
			for(int j = 0; j < 3; j++) {
				if(Triqui.board[i][j] == 1) {
					line(j*(400/3), i*(400/3), (j+1)*(400/3), (i+1)*(400/3));
					line((j+1)*(400/3), i*(400/3), j*(400/3), (i+1)*(400/3));
				} else
					if(Triqui.board[i][j] == 0){
						ellipseMode(CENTER);
						ellipse(((j+1)*(400/3))/2, ((i+1)*(400/3))/2, width/3, heigth/3);
					}
			}
	}
	
	public static void main(String[] args) {
			
		String[] appletArgs = new String[] {"triqui.Triqui"};
		PApplet.main(appletArgs);
	
	}

}
