package collections_practice_programs;

import java.util.ArrayList;

public class ArrayListProgram2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(Integer i : al) {
			System.out.println(i);
		}
	}

}
