package ArrayListProgram;

import java.util.ArrayList;

public class ArrayListProgram5 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        int n = 2; // remove 3rd element

        if (n < colors.size()) {
            colors.remove(n);
        }

        System.out.println(colors);
    }
}