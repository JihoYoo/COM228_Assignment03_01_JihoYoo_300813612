/*
 * JihoYoo(300813612)
 * November 13, 2015
 * Assignment 3-1 : Dice Rolling Application
 */
import java.util.Random;

public class DiceDriver {

	public static void main(String[] args) {
		
		
			int dice1; 
			int dice2;
			int sum;
	        Random rnd = new Random();
	        int[] tallyArray = new int[13];
	        
	         
	        
	        for(int i = 0; i < 36000; i++){
	        	dice1 = 1 + rnd.nextInt(6);
	        	dice2 = 1 + rnd.nextInt(6);
	            sum = dice1 + dice2; //The sum of the two values should then be calculated
	            ++tallyArray[sum];
	        }
	        
	         
	        //Use a one-dimensional array
	        for(int i = 2; i < tallyArray.length; i++){
	        	System.out.println(i + ": " + tallyArray[i]); //Display the results
	        }
	    } 
	}

