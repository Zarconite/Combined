package minesweeperGrid;

import java.util.Random;
import java.util.Scanner;

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
			
			int[][] intArray = new int[xGridSpaces][yGridSpaces];
			
			for(int l=0; l<yGridSpaces; l++) {
				for(int m=0; m<xGridSpaces; m++) {
					
					/* Find number of mines around a grid space */
					
					if(l>0 && gridArray[l-1][m]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					if(l<yGridSpaces-1 && gridArray[l+1][m]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					if(m>0 && gridArray[l][m-1]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					if(m<xGridSpaces-1 && gridArray[l][m+1]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					if(l<yGridSpaces-1 && m>0 && gridArray[l+1][m-1]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					if(l>0 && m>0 && gridArray[l-1][m-1]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					if(l<yGridSpaces-1 && m<xGridSpaces-1 && gridArray[l+1][m+1]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					if(l>0 && m<xGridSpaces-1 && gridArray[l-1][m+1]=="[X]") {
						intArray[l][m]=intArray[l][m]+1;
					}
					
					/* debug view numbers generated
					if(m==(xGridSpaces-1)) {
						System.out.println(intArray[m][l]); //print next line if it's reached the end of the row
					}
					else {
						System.out.print(intArray[m][l]); //print a row of grid spaces
					}
					*/
					
				}
			}
			
			/* Populate empty grid spaces */
		
			for(int j=0; j<yGridSpaces; j++) {
				for(int k=0; k<xGridSpaces; k++) {
					if(gridArray[k][j]!="[X]" && intArray[k][j]==0) {
						gridArray[k][j]= "[ ]";
					}
					else if(gridArray[k][j]!="[X]") {
						gridArray[k][j]= "["+intArray[k][j]+"]";
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
		
		int xSize = 0;
		int ySize= 0;
		int mines = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of x/y grid spaces:");
		
		try {
			xSize = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println("Please enter a valid number!");
		}
		
		/* Edited out for now, different aspect ratio's throw an exception
		 
		System.out.println("Enter Number of y grid spaces:");
		try {
			ySize = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println("Please enter a valid number!");
		}*/
		
		System.out.println("Enter Number of mines:");
		try {
			mines = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println("Please enter a valid number!");
		}
		
		scanner.close();
		
		System.out.println("Generating grid of size: "+xSize+"x"+xSize+" with "+mines+" mines."); //set back to ySize after fixing different aspect ratio's, same for the line below
		buildArray(xSize,xSize,mines); //[X spaces], [Y spaces], [Number of mines]
		
	}
}
