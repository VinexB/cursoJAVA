package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account acc = new Account (1001, "Marcus", 0.0);
		BusinessAccount bacc = new BusinessAccount (1002, "Vinícius", 0.0, 500.0);
		
		//UPCASTING 
		//CONVERTENDO UM OBJETO DA SUBCLASSE PARA A SUPERCLASSE
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount (1003, "Bob", 0.0, 200.0);
		Account acc3 = new BusinessAccount (1004, "Ana", 0.0, 500.0);
		
		//DOWNCASTING
		//CONVERTENDO UM OBJETO DA SUPERCLASSE PARA A SUBCLASSE
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; (ERRO)
		// VERIFICAR SE É INSTÂNCIA COM O instanceof
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(900.00);
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			System.out.println(acc + "," + acc5 + ", " + acc1);
		}
		
		//SOBREPOSIÇÃO
		
		Account acc6 = new Account (2001, "Belloti", 2000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(2002, "Batista", 9000.00, 0.08);
		acc7.withdraw(160.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(2003, "Vinex", 128000.00, 100000.00);
		acc8.withdraw(61000.00);
		System.out.println(acc8.getBalance());
		
		//POLIMORFISMO
		
		Account x = new Account (1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1021, "Maria", 6000.0, 0.06);
		
		x.withdraw(60.0);
		y.withdraw(600.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		
		
		
		
	}

}
