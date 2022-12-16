package AdventOfCode;
import java.util.Scanner;

import main.AdventUtilities;

import java.io.File;
import java.io.FileNotFoundException;


public class DayOne {
	public static void main(String[] args) throws FileNotFoundException {
		String[] s = AdventUtilities.reader("input");
		int[] nums = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			nums[i] = Integer.parseInt(s[i]);
		}
		System.out.println("the number of increases is " + partOne(nums, s));
		System.out.println("the number of group increases is " + partTwo(nums, s));

	}

	public static int partOne(int[] nums, String[] s) {
		int counter = 0;
		for (int i = 1; i < s.length; i++) {
			if (nums[i-1] < nums[i]) {
				counter ++;
			}
		}
		return counter; 
	}
	
	public static int partTwo(int[] nums, String[] s) {
		int counter = 0;
		for (int i = 3; i < s.length; i++) {
			int groupA = nums[i-3] + nums[i-2] + nums[i-1];
			int groupB = nums[i-2] + nums[i-1] + nums[i];
			if (groupA < groupB) {
				counter ++;
			}
		}
		return counter; 
	}
}
