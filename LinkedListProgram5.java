//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))


package LinkedListProgram;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListProgram5 {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");

	        Collections.swap(list, 0, 2);

	        System.out.println(list);
	    }
	}
