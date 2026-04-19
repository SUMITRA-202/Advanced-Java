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