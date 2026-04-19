package LinkedListProgram;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgram1 {

	public static void main(String[] args) {
		  LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");
	        list.add("Yellow");

	        ListIterator<String> it = list.listIterator(1);

	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}