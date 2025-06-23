package java_streams_practice_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		
		try {
			fis = new FileInputStream("Student.txt");
			oos = new ObjectInputStream(fis);
			Object o = oos.readObject();
			System.out.println(o.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
