package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> gameRelease = new LinkedList<String>();

		gameRelease.add("Tom");
		gameRelease.add("Mark");
		gameRelease.add("Jeff");
		gameRelease.add("Dan");

		System.out.println(gameRelease);

		gameRelease.remove("Dan");

		System.out.println(gameRelease.peek());

		System.out.println(gameRelease.poll());

		System.out.println(gameRelease);

		for(String person: gameRelease){
			System.out.println(person + " is waiting for the new game release.");
		}

		Iterator it = gameRelease.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + " is waiting for the new game release.");

		}


	}

}
