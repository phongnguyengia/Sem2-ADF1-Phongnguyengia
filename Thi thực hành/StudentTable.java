package phong;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTable {
	ArrayList<Student> st = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	public StudentTable() {}
	public void addStudent(ArrayList<Student> stutab) {
		System.out.println("Enter Student Id");
		String id = sc.nextLine();
		System.out.println("Enter Student Name");
		String name = sc.nextLine();
		System.out.println("Enter Student Address");
		String add = sc.nextLine();
		System.out.println("Enter Student Phone");
		String phone = sc.nextLine();
		Student s = new Student(id,name,add,phone);
		stutab.add(s);
	}
	
	public void display(ArrayList<Student> stutab) {
		System.out.println("StudentID      StudentName    Address     Phone");
		for(Student o: stutab) {
			System.out.println(o.getId()+"    "+o.getName()+"      "+o.getAddress()+"      "+o.getPhone());
		}
	}
	
	public void save(ArrayList<Student> stutab) {
		this.st = stutab;
	}
	
	public static void main(String[] args) {
		StudentTable studentTable = new StudentTable();
		ArrayList<Student> s = new ArrayList();
		
		
		do {
			System.out.println("Choose action:");
			System.out.println("1.Add student records");
			System.out.println("2.Display student record");
			System.out.println("3.Save");
			System.out.println("4.Exit");
			int choose = Integer.parseInt(sc.nextLine());
			switch(choose) {
			case 1: studentTable.addStudent(s);
					break;
			case 2: studentTable.display(s);
					break;
			case 3: studentTable.save(s);
					break;
			case 4: System.exit(0);;
			}
		}while(true);
		
	}
	
	
	
	
	
}
