package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

			Map<String, String> map = new HashMap<String, String>();
			map.put("Teacher", "Mafi Sir");
			map.put("Institute", "PNT");
			map.put("Location", "NYC");
			map.put("Course", "Selenium");

			for(Map.Entry<String, String> entry:map.entrySet()) {
				System.out.println(entry.getKey()+ " : "+ entry.getValue());
			}
		}
	}


