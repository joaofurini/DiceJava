package code;

import java.util.Scanner;
import java.util.ArrayList;


public class Dice {
	
	public static int checkLenght(ArrayList<Integer> numberList) {
		ArrayList<Integer> numsInRow = new ArrayList<Integer>();
		int row = 0;
		for(int i=0; i<numberList.size(); i++) {
			if(numberList.get(i)==6) {
				row = 0;
			}
			else {

				row+=1;
				numsInRow.add(row);
			}
		}
		row=0;
		System.out.println(numsInRow);
		for(int i=1; i<numsInRow.size(); i++) {
			if(numsInRow.get(i) > numsInRow.get(i-1)) {
				row = numsInRow.get(i);
				
			}
		}
		return row;
		}
	
	public static int checkConsecutive(ArrayList<Integer> numberList){
		
		int consecutiveTimes= 0;

	for(int i=1; i < numberList.size(); i++) {
		if(numberList.get(i) == 6 & numberList.get(i-1) ==6) {
				consecutiveTimes++;
				i++;
		}
	
		
	}
		
		return consecutiveTimes;
	}	
	
	public static int checkNumber(int number) {
		Scanner read = new Scanner(System.in);
		while(number==0 || number>6) {
			System.out.println("That's even a dice number");
			System.out.println("Please type again.");
			number = read.nextInt();
		}
		return number;
	}
	
	public static void main(String[] args) {
		
		boolean play = true;
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		while(play) {
			@SuppressWarnings("resource")
			Scanner cs = new Scanner(System.in);
			System.out.println("How many times do you roll the dices? ");
			int timesRolled = read.nextInt();
			
			System.out.println("Type the values of the dice in order: " );
			for(int i=0; i<= timesRolled-1; i++) {
				System.out.print("Number: ");
				
				int diceNumber = checkNumber(read.nextInt());
				numberList.add(diceNumber);
			
			}
			System.out.println(numberList);
			int consecutive = checkConsecutive(numberList);
			
				System.out.println("You got: "+ checkLenght(numberList)+ " numbers in a row without 6");
				System.out.println("You got: "+consecutive + " consecutives numbers 6");
			
			}
		
	}
}
			
			
			
			
	
		

	

	

