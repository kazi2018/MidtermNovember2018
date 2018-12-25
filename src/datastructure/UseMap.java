package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> games = new ArrayList<>();
		games.add("Uncharted");
		games.add("Halo");
		games.add("Legend of Zelda");
		games.add("God of War");

		List<String> dc = new ArrayList<>();
		dc.add("Batman");
		dc.add("Superman");
		dc.add("Green Lantern");
		dc.add("Flash");


		List<String> marvel = new ArrayList<>();
		marvel.add("Captain America");
		marvel.add("Ironman");
		marvel.add("Thor");
		marvel.add("Hulk");



		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("Games",games);
		list.put("DC", dc);
		list.put("Marvel",marvel);

		System.out.println(list);

		System.out.println(" ");
		System.out.println("Printout the values using for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " --------> " +st.getValue());
		}



		System.out.println(" ");
		System.out.println("Printout the values using iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}






	}

}