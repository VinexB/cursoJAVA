package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of Tax Payers: ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {

			System.out.println("Tax Payer #" + i + " data:");
			System.out.print("Individual or Company (i/c): ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			sc.nextLine();
			if (type == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));

			} else {
				System.out.print("Number of employess: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));

			}

		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAYED: ");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + " $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXES $ " + String.format("%.2f", sum));

		sc.close();
	}

}
