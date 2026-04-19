//Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)//

package ArrayListProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram3 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        Collections.sort(colors);

        System.out.println("Sorted Colors: " + colors);
    }
}
