package com.company.entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public Integer getNumber() {
        return number;
    }

   public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
