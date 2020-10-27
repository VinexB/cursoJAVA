package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//vari�vel declarada para instancia��o ap�s o if, do contr�rio estaria limitada a condi��o
		Account account;
		
		System.out.println("Digite o n�mero da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o nome do propriet�rio da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Ser� efetuado deposito inicial? (s/n) ");
		char response = sc.next().charAt(0);
			if (response == 's') {
				System.out.print("Digite o valor do deposito inicial: ");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, holder, initialDeposit);
			} else {
				account = new Account(number, holder);
			}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Digite o valor do dep�sito: ");
		double depositValue = sc.nextDouble();
		account.deposit (depositValue);
		System.out.println("Dados atualizados da conta: ");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Digite o valor a ser sacado: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados atualizados da conta: ");
		System.out.print(account);
		
		
		sc.close();
	}

}
