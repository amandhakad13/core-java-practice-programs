package java_streams_practice_programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	public int id;
	public String name;
	public int age;
	
	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return id+" "+name+" "+age;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Student s = new Student(101, "Aman", 21);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("Student.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("Work Done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
