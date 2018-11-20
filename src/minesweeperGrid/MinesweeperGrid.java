package minesweeperGrid;

import java.util.Random;

public class MinesweeperGrid {
	
	public static void buildArray(int xGridSpaces, int yGridSpaces, int numberOfMines) {
		
		String[][] gridArray = new String[xGridSpaces][yGridSpaces];
		
		Random randomGen = new Random();
		
		int xPos = 0;
		int yPos = 0;
		int totalSpaces = xGridSpaces*yGridSpaces;
		
		/* Ensure there are enough spaces */
		
		if(totalSpaces<numberOfMines) {
			System.out.print("To many mines!");
		}
		else { //if there are enough spaces, run all of the below code
		
		/* Add mines */
		
			/* Randomly generate a mine position */
			
			for(int i=0; i<numberOfMines; i++) {
		xPos = randomGen.nextInt(xGridSpaces);
		yPos = randomGen.nextInt(yGridSpaces);
		boolean mineTrue = false;

			/* Run a while loop to ensure a mine isn't already in the generated location */
		
		while(mineTrue==false) {
			if(gridArray[xPos][yPos]!= "[X]") {
				mineTrue=true;
			}
			xPos = randomGen.nextInt(xGridSpaces); //Generate X position based off of the maximum number of spaces
			yPos = randomGen.nextInt(yGridSpaces); //Generate Y position based off of the maximum number of spaces
		}
		
		gridArray[xPos][yPos]= "[X]"; //If grid space is empty, place a mine
			}
			
			/* Populate empty grid spaces */
		
			for(int j=0; j<yGridSpaces; j++) {
				for(int k=0; k<xGridSpaces; k++) {
					if(gridArray[k][j]!="[X]") {
						gridArray[k][j]= "[ ]";
					}
					if(k==(xGridSpaces-1)) {
						System.out.println(gridArray[k][j]); //print next line if it's reached the end of the row
					}
					else {
						System.out.print(gridArray[k][j]); //print a row of grid spaces
					}
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		buildArray(11,11,35); //[X spaces], [Y spaces], [Number of mines]
		
	}
}
