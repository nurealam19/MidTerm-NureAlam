package math.problems;

import databases.ConnectToSqlDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) throws SQLException {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		//find lowest number from the array
		int lowestNUmber = array[0];
		for(int i : array){
			if(i<lowestNUmber){
				lowestNUmber=i;
			}
		}
		System.out.println("The lowest number is: " + lowestNUmber);

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		int[] newArray = new int[1];
		newArray[0] = lowestNUmber;

		List<String> lowestValue = new ArrayList<String>();

		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(newArray, "tbl_lowestNumber", "SortingNumbers");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "SortingNumbers");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}


}
