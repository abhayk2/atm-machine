package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int CustomerNumber;
    private int PinNumber;
    private int checkingBalance=0;
    private int savingBalance=0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int CustomerNumber) {
        this.CustomerNumber = CustomerNumber;
        return CustomerNumber;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public int setPinNumber(int pinNumber) {
        PinNumber = pinNumber;
        return PinNumber;
    }

    public int getPinNumber() {
        return PinNumber;
    }

    public int setCheckingBalance(int checkingBalance) {
        this.checkingBalance = checkingBalance;
        return checkingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public int setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
        return savingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount){
        checkingBalance -= amount;
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount){
        savingBalance -= amount;
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount){
        checkingBalance += amount;
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount){
        savingBalance += amount;
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking account: ");
        double amount = input.nextDouble();

        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));

        }else{
            System.out.println("Balance can not be Negative!");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount You want to withdraw from saving account: ");
        double amount = input.nextDouble();

        if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance can not be negative!");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount You want to deposit in checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Account Balance: "+ moneyFormat.format(checkingBalance));

        }else{
            System.out.println("BALANCE CANNOT BE NEGATIVE!\n");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Account: ");
        double amount = input.nextDouble();

        if((savingBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.printf("New Saving account Balance: %s", moneyFormat.format(savingBalance));

        }else {
            System.out.println("Balance can not be negative!");
        }
    }






}
