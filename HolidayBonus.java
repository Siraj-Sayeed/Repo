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

import java.io.File;
import java.util.*;

public class HolidayBonus {
	
	private final static double highBonus = 5000;
	private final static double lowBonus = 1000;
	private final static double standardBonus = 2000;
	
	// get array of doubles corresponding to bonuses of each store
	public static double[] calculateHolidayBonus(double[][] ragArr) {
		
		TwoDimRaggedArrayUtility calc = new TwoDimRaggedArrayUtility();
		
		double[] toRet = new double[ragArr.length];
		
		// set up flags to get bonuses
		int[][] m = new int[ragArr.length][];
		
		for(int i = 0; i < ragArr.length; i++) {
			m[i] = new int[ragArr[i].length];
		}
		
		for(int col = 0; col < ragArr[0].length; col++) {
			
			m[calc.getLowestInColumnIndex(ragArr, col)][col] = 1;
			m[calc.getHighestInColumnIndex(ragArr, col)][col] = 2;
			
		}
		
		for(int i = 0; i < m.length; i++) {
			
			for(int j = 0; j < m[i].length; j++) {
				
				if(m[i][j] == 2)
					toRet[i] += highBonus;
				else if(m[i][j] == 1)
					toRet[i] += lowBonus;
				else
					toRet[i] += standardBonus;
				
			}
		
		}
		
		return toRet;
	}
	
	// get total bonus from ragged array
	public static double calculateTotalHolidayBonus(double[][] ragArr) {
		
		double toRet = 0;
		
		double[] bonuses = calculateHolidayBonus(ragArr);
		
		for(int i = 0; i < bonuses.length; i++) {
			toRet += bonuses[i];
		}
		
		return toRet;
		
	}

}
