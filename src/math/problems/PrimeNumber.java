package math.problems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class PrimeNumber {

	public static void main(String[] args) {
		//connectToSqlDatabase;
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int number = 0;
		String primeNumber = "";
		for(int i = 1; i<=100; i++){
			int counter =0;
			for(number = i; number>=1; number--){
				if(i % number ==0){
					counter = counter+1;
				}
			}
			if(counter ==2){
				primeNumber = primeNumber+i + " ";
			}
		}
		System.out.println("Prime Number from 2 to 1000 are: ");
		System.out.println(primeNumber);


	}

}
