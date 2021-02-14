package examples;

public class ArrayListStudentRunner {

	public static void main(String[] args) {

		ArrayListStudent student = new ArrayListStudent("usha", 10, 20, 40, 30);

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks :" + number);

		int sum = student.getSumOfMarks();
		System.out.println("sum of marks : " + sum);

		System.out.println(student);

		student.addNewMark(18);

		System.out.println(student);

		student.removeMarkBasedOnIndex(3);

		System.out.println(student);

	}

}
