package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " Data: ");
			System.out.print("Outsourced (y/n)");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			sc.nextLine();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				//INSTANCIANDO O EMPREGADO DIRETAMENTE NA LISTA
				list.add(new OutSourcedEmployee(name, hour, valuePerHour, additionalCharge));
			} else {
				list.add( new Employee(name, hour, valuePerHour));
			}
		}
		
		
		System.out.println("Payments: ");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		
		sc.close();
	}

}
