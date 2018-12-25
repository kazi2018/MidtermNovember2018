package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> ar = new ArrayList<String>();

		ar.add("Playstation");
		ar.add("Xbox");
		ar.add("Nintendo");
		ar.add("Sega");
		System.out.println("Adding all the values of: " + ar);




		System.out.println(" ");
		System.out.println("Printout the values using while loop with Iterator.....");
		Iterator it = ar.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


		ar.remove("Sega");
		System.out.println("Removing the value: " + ar);





		System.out.println(" ");
		System.out.println("Printout the values using For Each loop.....");

		for (String st : ar) {
			System.out.println(st);

		}

	}


}