package com.traineeatjava.ltiday5;
import java.util.*;

import com.traineeatjava.lti.ObjectClass.Person;

public class ExampleOnList {
	public static void main(String[] args) {
		//<> angular brace notation is called as generics in Java
		List<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".NET");
		list1.add("PHP");
		list1.add("Java");
		
		List<String> webTech = new ArrayList<>();
		webTech.add("HTML");
		webTech.add("CSS3");
		
		list1.addAll(webTech);
		System.out.println(list1);
		
		//Different ways of iterating over list
		
		System.out.println("Option 1: Traditional for Loop");
//		for(int i = 0; i < list1.size(); i ++) {
//			System.out.println(list1.get(i));
//		}
//		
//		System.out.println("Option 2: Using for each Loop");
//		for(String str: list1)
//			System.out.println(str);
//		
//		System.out.println("Option 3: Java 8 lambda style for-each");
//		list1.forEach(str -> System.out.println(str));
//		
//		System.out.println("Option 4: Traditional Interator");
//		Iterator<String> itr = list1.iterator();
//		while(itr.hasNext());
//			System.out.println( itr.next());
		
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person("Pooja", 30));
		list2.add(new Person("Angela", 45));
		list2.add(new Person("Amit", 35));
		list2.add(new Person("Akhil", 50));
		
		for(Person p : list2)
			System.out.println(p);
		
		//Cannot use for each loop top display two lists at the same time
		
		
		
	}
}
