package gameOfLife;

import java.util.Random;

import processing.core.PApplet;

public class GoL extends PApplet {
	
	public class Logic {
		
		public int board [][]; 

		public Logic(int width, int heigth)
		{
			this.board = new int [heigth][width];
			this.random_population(heigth, width);	
		}
		
		public void random_population (int heigth, int width) {
			
			Random rd = new Random();
			double alive_probability = 0.15;
			
			for(int i = 0; i < heigth; i++) 
				for(int j = 0; j < width; j++)
					this.board [i][j] = rd.nextDouble() < alive_probability ? 1 : 0;
			
		}
		
		public void nextIteration () {
			
			int counter = 0;
			
			height = 80;
			width = 80;
			
			for (int i = 0; i < height; i++ )
				for (int j = 0; j <  width; j++ )
				{
					
					counter = board [(i - 1 + height) % height][(j - 1 + width) % width] +  
							  board [(i - 1 + height) % height] [j] + 
							  board [(i - 1 + height) % height][(j + 1) % width] + 
							  board [i][(j - 1 + width) % width] + 
							  board [i][(j + 1) % width] + 
							  board [(i + 1) % height][(j - 1 + width) % width] + 
							  board [(i + 1) % height][j] + 
							  board [(i + 1) % height][(j + 1) % width]; 
					
					if(board[i][j] == 1)
						board[i][j] = (counter < 2 || counter > 3) ? 0 : 1;
					else
						board[i][j] = (counter == 3) ? 1 : 0;						
				}	
			}
	}
	
	public int width = 80, heigth = 80, square_size = 8; 
	Logic GoL = new Logic(width, heigth);
	
	public void settings() {
		
		size(width * square_size, heigth * square_size);
		
	}
	
	public void draw() {
		
		background(50);
		
		for(int i = 0; i < heigth; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(GoL.board[i][j] == 1)
					fill(0, 0, 255);
				else
					fill(0);
				
				rect(j * square_size, i * square_size, square_size, square_size );
			}
			
			try {
				
				Thread.sleep(10);
				GoL.nextIteration();
				
			} catch (Exception ex) {ex.printStackTrace();}
			
		}
			
	}
	
	public static void main(String[] args) {
		
		String[] appletArgs = new String[] {"gameOfLife.GoL"};
		PApplet.main(appletArgs);
		
	}

}
