package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Practice {
public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		System.out.println(list);
		
		list.add(4); // this will add 4 at the end of the list
		System.out.println(list);
		
//	 this will add 50 at the index of 1 of the list
		list.add(1,50); 
		System.out.println(list);
		
//	 Creating new list
		List<Integer> nList = new ArrayList<>();
		nList.add(90);
		nList.add(100);
		
		list.addAll(nList); // This will add all the elements of new list in older list
		System.out.println(list);
		
//	 TO GET THE ELEMENTS
		System.out.println(list.get(1)+" "+list.get(3));
		
//	 To remove the element from list
		list.remove(1); // this will remove the element from the index of 1
		System.out.println(list);
		list.remove(Integer.valueOf(30)); // this will remove the 30 from te starting Index of list
		System.out.println(list);
		
//	 To UPDATE THE PERTICULAR ELEMENT
		list.set(2, 50); // this will update the 2nd index of element 
		System.out.println(list);
		
//	 TO CHECK THE PERTICULAR ELEMENT IS PRESENT IN THE LIST OR NOT
		boolean value = list.contains(50); // this will check the 40 is present in the list or not
		System.out.println(value);
		
//	 TO TERVERS THE LIST
		for(int i=0; i<list.size(); i++) {
			System.out.println("the element is : "+ list.get(i));
		}
	
//	 Traverse the list by forEach loop
		int a=0;
		System.out.println("\n");
		for( Integer element: list) {
			System.out.println("At the "+ a++ +" Index = " + element);
		}

//	 Traverse the list by Iterator
		System.out.println();
		Iterator<Integer> x = list.iterator();
		while(x.hasNext()) {
			System.out.println("iterator : "+ x.next());
		}
	}

}
