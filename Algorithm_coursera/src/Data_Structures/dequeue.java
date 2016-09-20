package Data_Structures;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

import org.omg.Messaging.SyncScopeHelper;

public class dequeue {
	public static void main(String[] args) {
		Deque d = new LinkedList<>();
		
		d.add("First");
		d.addFirst("patiram");
		d.addLast("Python");
		d.offer("laptop");
		d.offerFirst("chasma");
		d.offerLast("kattu");
		d.push("pushed");
		System.out.println(d + "\n");
		
		//Iterating
		Iterator it = d.iterator();
		while(it.hasNext()){
			System.out.println("\t" + it.next());
		}
		System.out.println("After reversing");
		
		Iterator reverse = d.descendingIterator();
		while(reverse.hasNext()){
			System.out.println("\t" + reverse.next());
		}
		
		
	}

}
