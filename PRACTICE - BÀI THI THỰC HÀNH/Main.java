package phong;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			EmployeeFulltime empFull = new EmployeeFulltime();
			EmployeeParttime empPart = new EmployeeParttime();
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter base Salary: ");
			float baseSalary = input.nextFloat();
			SalaryPolicy.setBaseSalary(baseSalary);
			
			System.out.println("Print salary for employee FullTime: " + empFull.getSalary());
		    System.out.println("Print salary for employee Partime: " + empPart.getSalary());
			
			
		}
}
