/*
 *  Class: CMSC203 CRN 20931
 Program: Assignment #5
 Instructor: Professor Khandan
 Summary of Description: TwoDimRaggedArrayUtility, allows for user to collect information on  a given ragged array, Holiday Bonus, using TwoDimRaggedArrayUtility can simulate a bonus based on information provided in ragged array
 Due Date:11/03/2024
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student Name: Siraj Sayeed
 */

import java.util.*;
import java.io.*;
public class TwoDimRaggedArrayUtility {
	
	// builds ragged matrix from a file
	public static double[][] readFile(File theFile)  {
		
		try {
			
			Scanner getRow = new Scanner(theFile);
			double[][] toRet;
			
			int countRow = 0;
			
			while(getRow.hasNextLine()) {
				countRow++;
				getRow.nextLine();
			}
			
			toRet = new double[countRow][];
			
			Scanner getCol = new Scanner(theFile);
			int count = 0;
			
			while(getCol.hasNextLine()) {
				
				toRet[count] = new double[getCol.nextLine().split(" ").length];
				count++;
				
			}
			
			Scanner buildRaggedArr = new Scanner(theFile);
			int row = 0;
			
			while(buildRaggedArr.hasNextLine()) {
				
				String[] toConvert = buildRaggedArr.nextLine().split(" ");
				
					for(int col = 0; col < toRet[row].length; col++)
						toRet[row][col] = Double.parseDouble(toConvert[col]);
					
					row++;
				
			}
			
			
			return toRet;
			
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	// creates new file from ragged matrix
	public static void writeToFile(double[][] ragArr, File theFile) {
		
		try {
			
			PrintWriter outfile =  new PrintWriter(theFile);
			for(int row = 0; row < ragArr.length; row++) {
				
				for(int col = 0; col < ragArr[row].length; col++) {
					
					outfile.print(ragArr[row][col] + " ");
					
				}
				
				outfile.println();
				
			}
			
			outfile.close();
		
		
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
	}
	
	// get total of ragged matrix
	public static double getTotal(double[][] ragArr) {
		
		double total = 0;
		
		for(int row = 0; row < ragArr.length; row++)
			for(int col = 0; col < ragArr[row].length; col++)
				total += ragArr[row][col];
		
		return total;
		
	}
	
	// get average of ragged matrix
	public static double getAverage(double[][] ragArr) {
		
		double count = 0;
		
		for(int row = 0; row < ragArr.length; row++)
			for(int col = 0; col < ragArr[row].length; col++)
				count++;
		
		return getTotal(ragArr)/count;
		
	}
	
	// get total in a row
	public static double getRowTotal(double[][] ragArr, int row) {
		
		double total = 0;
		
		for(int col = 0; col < ragArr[row].length; col++)
			total += ragArr[row][col];
		
		return total;
		
	}
	
	// get total of a column
	public static double getColumnTotal(double[][] ragArr, int col) {
		
		double total = 0;
		
		for(int row = 0; row < ragArr.length; row++) {
			
			if(col < ragArr[row].length)
				total += ragArr[row][col];
			
		}
		
		return total;
		
	}
	
	// get highest value in a rpw
	public static double getHighestInRow(double[][] ragArr, int row) {
		
		double max = ragArr[row][0];
		
		for(int col = 1; col < ragArr[row].length; col++)
			max = max < ragArr[row][col] ? ragArr[row][col] : max;
		
		return max;
		
	}
	
	// get highest index in a row
	public static int getHighestInRowIndex(double[][] ragArr, int row) {
		
		int maxIndex = 0;
		
		for(int col = 1; col < ragArr[row].length; col++)
			maxIndex = ragArr[row][maxIndex] < ragArr[row][col] ? col : maxIndex;
		
		return maxIndex;
		
	}
	
	// get highest value in a column
	public static double getHighestInColumn(double[][] ragArr, int col) {
		
		double max = ragArr[0][col];
		
		for(int row = 1; row < ragArr.length; row++)
			if(col < ragArr[row].length)
				max = max < ragArr[row][col] ? ragArr[row][col] : max;
		
		return max;
		
	}
	
	// get highest index in a column
	public static int getHighestInColumnIndex(double[][] ragArr, int col) {
		
		int maxIndex = 0;
		
		for(int row = 1; row < ragArr.length; row++)
			if(col < ragArr[row].length)
				maxIndex = ragArr[maxIndex][col] < ragArr[row][col] ? row : maxIndex;
		
		return maxIndex;
		
	}
	
	// get lowest value in a row
	public static double getLowestInRow(double[][] ragArr, int row) {
			
			double min = ragArr[row][0];
			
			for(int col = 1; col < ragArr[row].length; col++)
				min = min > ragArr[row][col] ? ragArr[row][col] : min;
			
			return min;
		
	}
	
	// get lowest index in a row
	public static int getLowestInRowIndex(double[][] ragArr, int row) {
		
		int minIndex = 0;
		
		for(int col = 1; col < ragArr[row].length; col++)
			minIndex = ragArr[row][minIndex] > ragArr[row][col] ? col : minIndex;
		
		return minIndex;
		
	}
	
	// get lowest value in a column
	public static double getLowestInColumn(double[][] ragArr, int col) {
		
		double min = ragArr[0][col];
		
		for(int row = 1; row < ragArr.length; row++)
			if(col < ragArr[row].length)
				min = min > ragArr[row][col] ? ragArr[row][col] : min;
		
		return min;
		
	}
	
	// get lowest index in a column
	public static int getLowestInColumnIndex(double[][] ragArr, int col) {
		
		int minIndex = 0;
		
		for(int row = 1; row < ragArr.length; row++)
			if(col < ragArr[row].length)
				minIndex = ragArr[minIndex][col] > ragArr[row][col] ? row : minIndex;
		
		return minIndex;
		
	}
	
	// get highest value in array
	public static double getHighestInArray(double[][] ragArr) {
		
		double max = Double.MIN_VALUE;
		
		for(int row = 0; row < ragArr.length; row++)
			for(int col = 0; col < ragArr[row].length; col++)
				max = max < ragArr[row][col] ? ragArr[row][col] : max;
		
		return max;
		
	}
	
	// get lowest value in array
	public static double getLowestInArray(double[][] ragArr) {
		
		double min = Double.MAX_VALUE;
		
		for(int row = 0; row < ragArr.length; row++)
			for(int col = 0; col < ragArr[row].length; col++)
				min = min > ragArr[row][col] ? ragArr[row][col] : min;
		
		return min;
		
	}
	

}
