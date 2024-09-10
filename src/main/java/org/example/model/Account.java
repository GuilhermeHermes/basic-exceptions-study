package org.example.model;

import java.util.Objects;

public class Account {
    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Insira um valor maior que R$0,00");
        }
        this.balance += amount;
    }

    void withdrawl(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Insira um valor maior que R$0,00");
        }
        if(balance-amount < 0){
            throw new IllegalArgumentException("Seu saldo não pode ser negativo!");
        }
        this.balance -= amount + (amount*0.05);
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder "
                + holder
                + ", Balance: R$"
                + String.format("%.2f", balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}
