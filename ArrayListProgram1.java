//Write a java program for getting different colors through ArrayList interface and search whether the 
	//color "Red" is available or not

package ArrayListProgram;

import java.util.ArrayList;

public class ArrayListProgram1 {

	public static void main(String[] args) {
		 ArrayList<String> colors = new ArrayList<>();

	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");

	        if (colors.contains("Red")) {
	            System.out.println("Red is available in the list");
	        } else {
	            System.out.println("Red is NOT available in the list");
	        }
	    }
	}
