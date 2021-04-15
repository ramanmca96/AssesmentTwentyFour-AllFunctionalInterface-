package Com.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	int StudentId;
	String StudentName;
	int Studentmarks;

	public Student(int studentId, String studentName, int studentmarks) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		Studentmarks = studentmarks;
	}

}

public class AllFUnctionalConcepts {

	public static void main(String[] args) {

		Function<Student, String> fun = (a) -> {

			String grade = "";

			if (a.Studentmarks >= 80)
				grade = "Distinction";
			else if (a.Studentmarks <= 80 && a.Studentmarks > 60)
				grade = "First Class";
			else if (a.Studentmarks <= 60 && a.Studentmarks > 50)
				grade = "Second Class";
			else if (a.Studentmarks <= 50 && a.Studentmarks > 35)
				grade = "Third Class";
			else if (a.Studentmarks < 35)
				grade = "fail";

			return grade;

		};

		Predicate<Student> predicateExample = pre -> pre.Studentmarks > 80;
		
		Consumer<Student> consumerExample = c -> {
			System.out.println(c.StudentId + c.StudentName + c.Studentmarks);
		};

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(101, "Chozha", 98));
		list.add(new Student(101, "Chera", 88));
		list.add(new Student(101, "Pandiya", 60));
		list.add(new Student(101, "Rajendra", 45));
		list.add(new Student(101, "Karikala", 67));
		list.add(new Student(101, "ArulMozhi", 56));
		list.add(new Student(101, "Ravan", 100));
		list.add(new Student(101, "Indhiran", 78));
		list.add(new Student(101, "Raman", 50));

		for (Student student : list) {
			
			consumerExample.accept(student);
			fun.apply(student);
			System.out.println("   ");
			if (predicateExample.test(student)) {
					
			}
		}
	}
}
