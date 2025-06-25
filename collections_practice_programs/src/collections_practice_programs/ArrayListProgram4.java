package collections_practice_programs;

import java.util.ArrayList;

public class ArrayListProgram4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Orange");
		al.add("Mustard");
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		al.remove(0);
		
		System.out.println(al);
	}

}
