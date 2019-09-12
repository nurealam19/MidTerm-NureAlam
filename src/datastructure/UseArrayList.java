package datastructure;

import databases.ConnectToSqlDB;

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
		ArrayList<Object> arrayList = new ArrayList<>();

		arrayList.add(25);
		arrayList.add(56);
		arrayList.add(25);
		arrayList.add(12);
		arrayList.add(10);
		arrayList.add(21);
		arrayList.add(9);
		printForEach(arrayList);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

//		try {
//			connectToSqlDB.insertDataFromArrayToSqlTable(newArray, "tbl_lowestNumber", "SortingNumbers");
//			arrayList = connectToSqlDB.readDataBase("tbl_lowestNumber", "SortingNumbers");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
//		for(String st:lowestValue){
//			System.out.println(st);
//		}



		//arrayList.remove(3); // remove elements


		//for(Integer num : arrayList){ // this is for each loop
		//System.out.println((num));

		//Iterator iterator = arrayList.iterator(); // use Iterator
		//while (iterator.hasNext()){
		//System.out.println(iterator.next());
		//}

		//}
	}
	public static void printForEach(ArrayList<Object>arrayList){
		Iterator<Object> iterator  = arrayList.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	}