package org.example;


import org.example.model.Account;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
try {
    System.out.println("Enter the account number: ");
    int number = scanner.nextInt();
    System.out.println("Enter the account holder: ");
    scanner.nextLine();
    String accountHolder = scanner.nextLine();
    System.out.println("Have initial deposit(y/n)?");
    char response = scanner.next().charAt(0);
    double initialDeposit = 0;
    if (response == 'y') {
        System.out.println("Enter the initial deposit value: ");
        initialDeposit = scanner.nextDouble();
    }
    Account account = (response == 'y') ? new Account(number, accountHolder, initialDeposit) : new Account(number, accountHolder);
    System.out.println(account.toString());
    scanner.close();
}catch(IllegalArgumentException e){
    System.out.println("Erro:" + e.getMessage());
        }
    }
}