package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> aList= new ArrayList<>();

		aList.add("orange");
		aList.add("banana");
		aList.add("apple");
		aList.add("pear");
		aList.add("pineapple");

		aList.remove("apple");

		System.out.println(aList.get(aList.size()));

		for(String name : aList){
			System.out.println(name);
		}

		ConnectToSqlDB connect = new ConnectToSqlDB();
		connect.insertDataFromArrayToSqlTable(aList,"User","Name");
		connect.readDataBase("User","Name");


	}

}
