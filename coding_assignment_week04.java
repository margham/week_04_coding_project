package week04;

import java.util.Scanner;

public class coding_assignment_week04 {
	
	public static void main(String[] args) {
	
//question 1
	System.out.println("Question 1: Manipulating Arrays");	
	
	//1a.create an array of int called *ages* that contains: 3, 9, 23, 64, 2, 8, 28, 93
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
	//1b.programmatically subtract the first element in the array from the last element in the array.
	int subtractFirstFromLast = ages[ages.length - 1] - ages[0];
	
	//1c.print the result to the console
	System.out.println("The value of the last element \n minus the first element is: "+ subtractFirstFromLast);
	System.out.println("--------------------------------"); //separating out the questions

//question 2
	System.out.println("Question 2: Manipulating String Arrays");	
	
	//2a. Create an array of String called names containing "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//2b. iterate through the array, calculate the average number of letters per name. 
       	//print the result to the console.
	int totalLength = 0;
	for (String name : names) {
		totalLength += name.length();
	}
	int avgNameLength = totalLength / names.length;
	System.out.println("The average name (rounded to the \n nearest integer) has " + avgNameLength + " letters.");
	System.out.println("--------------------------------"); 
	
//question 3
	System.out.println("Question 3: How do you access the last element of any array?");
	System.out.println("Access the last element of any array by \n "
			+ "indexing it using [length - 1]. For example, for an \n "
			+ "array called numbers, access the last element \n by calling "
			+ "numbers[numbers.length - 1].");	
	
	System.out.println("--------------------------------"); 

//question 4
	System.out.println("Question 4: How do you access the first element of any array?");
	System.out.println("Access the first element of any array by \n "
				+ "indexing it using [0]. For example, for an \n "
				+ "array called numbers, access the first element \n by calling "
				+ "numbers[0].");
	System.out.println("--------------------------------"); 
	
//question 5
	System.out.println("Question 5: add length of each name to nameLengths array");
	//5a. Create a new array of int called nameLengths. 
	int[] nameLengths = new int[names.length];
		
	//5b. Write a loop to iterate over the previously created names array and add the length 
		//of each name to the nameLengths array.		
	int i = 0;
	for (String name : names) {
		nameLengths[i] = name.length();
		i++;
	}
	System.out.println("--------------------------------"); 
//question 6
	System.out.println("Question 6: calculate and print sum of nameLengths array");
	//iterate over the nameLengths array and calculate the sum of all elements
	int sumLengths = 0;
	for (int len : nameLengths) {
		sumLengths += len;
	}
	//print to console
	System.out.println("The sum of all the name lengths is: " + sumLengths);
	System.out.println("--------------------------------"); 

//question 7
	System.out.println("Question 7: Concatenate a string to itself n times");
	//see method at the end of main method under "Q7 Method" to see what I used here
	//multiplyWord = multiplyString(String word, int n);
	String multiplyBanana = multiplyString("banana", 5);
	System.out.println("banana concatenated 5x is: " + multiplyBanana + " XD");
	System.out.println("--------------------------------"); 

//question 8
	System.out.println("Question 8: take firstName and lastName and \n"
			+ "return fullName");
	//see method at end of main method under "Q8 Method"
	String fullName = combineNames("Elliot", "Quelliot");
	System.out.println("Elliot plus Quelliot is: " + fullName);
	System.out.println("--------------------------------"); 
		
//question 9
	System.out.println("Question 9: take an array of int, return true if \n"
			+ "sum of the array > 100");
	//see method at end of main method under Q9 Method"
	int[] testArray = {3, 9, 13, 44, 1, -6, 3, 14};
	boolean answer = greaterThan100(testArray);
	System.out.println("The array is bigger than 100: " + answer);
	System.out.println("--------------------------------"); 

//question 10
	System.out.println("Question 10: take an array of double, return the average");
	double[] doubArray = {87.6, 42.42, 13.13, 12, 24.1};
	//see Q10 Method at the end of the main method
	double avg = arrayAverage(doubArray);
	System.out.println("The average value of the test array is: " + avg);
	System.out.println("--------------------------------"); 
	
//question 11
	System.out.println("Question 11: take two arrays of double, return true if average \n"
			+ "of elements in first array is > average of elements in second array.");
	double[] doubleTrouble = {13.31, 11.11, 71.4, -13.9, 42};
	double avgTwo = arrayAverage(doubleTrouble);
	System.out.println("The average of the first array is greater \n than "
			+ "the average of the second array: " + (avg > avgTwo));
	System.out.println("--------------------------------"); 	
	
//question 12
	System.out.println("Question 12: write a method (willBuyDrink) to buy a drink if \n"
			+ "isHotOutside and moneyInPocket is > 10.50");
	//see below main method, Q12 Method
	boolean drink = willBuyDrink(true, 4.32);
	System.out.println("I can buy a drink!: " + drink);
	System.out.println("--------------------------------"); 	
	
//question 13
	System.out.println("Question 13: create a method of your own that solves a problem.");
	//see below main method, Q13 Method, for the method
	//i wrote this to tell me whether to take a break, go for a walk, 
	//drink water, or go outside
	//note that i didn't add any of the constraints i would use in production code to make sure
	//users only entered the narrow range of acceptable values. this is more a proof of concept
	//than a real program.
	System.out.println("Problem: I'm tired, what should I do now?");
	System.out.println("Luckily, I have a handy-dandy question-asker");
	whatNext(); 
	System.out.println("--------------------------------"); 	
	
	}//end main method
//Q7 Method:
public static String multiplyString(String word, int n) { //take a string and an integer
	StringBuilder result = new StringBuilder(); //make the object that will hold the values
	for (int i = 0; i < n; i++) { //iterate up to the value of n
		result.append(word); //for every iteration add the word to itself
	}
	return result.toString(); //turn the stringbuilder object into a string and return it
 }

public static String combineNames(String firstName, String lastName) { //take two strings
	String fullName = firstName + " " + lastName; //stick them together
	return fullName; //return the full name
}

//Q9 Method
public static boolean greaterThan100(int[] array) { //take an array input
	int sum = 0; //instantiate our sum value
	for(int i : array) {
		sum += i;
	} //add all the elements together in the sum value
	if (sum > 100) {
		return true;
	} else {
		return false; //if/else logic to show which boolean value t0 print
	}
}

//Q10 Method
public static double arrayAverage(double[] arrayOfDoubles) {
	double sum = 0;
	for(double value : arrayOfDoubles) {
		sum += value;
	}
	double avg = sum/arrayOfDoubles.length;
	return avg;
}

//Q12 Method
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if(isHotOutside == true && moneyInPocket > 10.50){
		return true;
	} else {
		return false;
	}
}

static Scanner input = new Scanner(System.in);
//Q13 Method
public static void whatNext() {
//questions and inputs
	System.out.print("How many minutes have you been working (enter a number)?"); //trying to get user input
	int minsWorking = input.nextInt();
	System.out.println("How many minutes has it been since you were last outside?");
	int minsSinceOutside = input.nextInt();
	System.out.println("Have you walked yet today (y/n)?");
	String didYouWalk = input.next();
	System.out.println("How many glasses of water have you had?");
	int glassesWater = input.nextInt();
//initialize the response values
	String response = "";
	String water = "";
//logic for responding to the inputs
	if (minsWorking > 60) {
		if(minsSinceOutside > 179) {
			if(didYouWalk == "n") {
				response = "Take a break and go for a walk right now!";
			} else {
				response = "Take a break, go outside and get some sun.";
			}
		} else {
			response = "Take a bathroom break.";
		}
	} else {
		response = "Sorry, keep working a bit longer.";
	}
	if (glassesWater < 3) {
		water = "Go get some water!"; //if i've been out and walking already but still need a break
		}
//print the responses
	System.out.println("You should..." + "\n" + response + "\n" + water);
}

}//end class
