package ArrayListProgram;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram4 {

	public static void main(String[] args) {
		  ArrayList<String> colors = new ArrayList<>();

	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");

	        List<String> sub = colors.subList(0, 2); // 0 to 1

	        System.out.println("Extracted elements: " + sub);
	    }
	}
