package _1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student("손오공", "1682");
		Student st2 = new Student("저팔계", "1111");
		Student st3 = new Student("사오정", "2222");
		
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
			
		}
		
	}

}
