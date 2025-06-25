package collections_practice_programs;

import java.util.ArrayList;

public class ArrayListProgram3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Apple");
		al.add("Mango");
		al.add("Banana");
		al.add("Litchi");
		al.add("Graps");
		al.add("Strawberry");
		
		System.out.println(al);
		
		al.add(0, "Guava");
		
		System.out.println(al);
		
		al.add(5, "Papaya");
		
		System.out.println(al);
	}

}
