package java8;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Collection {
	public static List<String> myList;
	
	public static void main(String [] arg){
//		myCollectionIterator();
//		myItrRemoveElement();
//		myListIterator();
//		myEnumeration();
	}
// Iterator is used to traverse only in Forward direction.	
	public static void myCollectionIterator(){
		myList = new ArrayList<String>();
		myList.add("Ashish");
		myList.add("Aman");
		myList.add("Arti");
		myList.add("Anjali");
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());   // this iterates the elements of ArrayList.
		}
		System.out.println(myList);    // it does not iterates. it prints complete ArrayList.
	}
	
	public static void myItrRemoveElement(){
		String removeElement1 = "Anjali";
		String removeElement2 = "Arti";
		System.out.println("Before Remove");
		System.out.println(myList);
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()){
			if(removeElement1.equals(itr.next())){
				itr.remove();
			}
		}
		System.out.println("After Remove");
		System.out.println(myList);
	}
// ListIterator is used to traverse in both direction.	
	public static void myListIterator(){
		myList.add("Garima");
		myList.add("Shraya");
		ListIterator<String> litr = myList.listIterator();
		System.out.println("Iterating in forward direction");
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		System.out.println("Iterating in backward direction"); // To run iterator in backward direction, firstly we have to move in forward direction(atleast one element). 
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
	}
// Enumeration is mainly works with	Legacy class. Enumeration can be replace with Iterator.
	public static void myEnumeration(){		
		Vector<String> dayNames = new Vector<String>();      
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday"); 
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		Enumeration<String> days = dayNames.elements();	      
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement()); 
		}
	} 
}
