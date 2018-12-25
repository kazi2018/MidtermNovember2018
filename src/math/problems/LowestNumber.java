
package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = {211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

//find lowest number from the array

ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
List<String> lowestValue = new ArrayList<String>();
try {
connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
} catch (Exception e) {
e.printStackTrace();
}
System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
for(String st:lowestValue){
System.out.println(st);
}
		int lowest = low(array);
		System.out.println(lowest);
	}
	public static int low(int[] array){
		for (int i = 0; i < array.length; i++) {
			if(array[0]>array[i])
				array[0] = array[i];
		}
		return array[0];

	}

}