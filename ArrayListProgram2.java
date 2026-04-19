package ArrayListProgram;

import java.util.ArrayList;

public class ArrayListProgram2 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue"
        colors.remove("Blue");

        System.out.println(colors);
    }
}