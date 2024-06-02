package org.example.Ejercicio_2;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    public Bank(){
        accounts = new ArrayList<Account>();
    }
    void addAccount(String accountNumber, double accountBalance){
        Account account = new Account(accountNumber,accountBalance);
        accounts.add(account);
    }

    double checkBalance(String accountNumber) throws Exception{
        for (Account account: accounts) {
            if(account.getAccountNumber().equals(accountNumber)){
                return account.getAccountBalance();
            }
        }
        throw new Exception("La cuenta no existe");
    }

    void deposit(String accountNumber, double amount) throws Exception{
        if(amount<0){
            throw new Exception("El deposito no puede ser negativo");
        }
        for (Account account: accounts) {
            if(account.getAccountNumber().equals(accountNumber)){
                account.setAccountBalance(account.getAccountBalance()+amount);
                return;
            }
        }
        throw new Exception("La cuenta no existe");
    }

    void extract(String accountNumber, double amount) throws Exception{
        if(amount<0){
            throw new Exception("El deposito no puede ser negativo");
        }
        for (Account account: accounts) {
            if(account.getAccountNumber().equals(accountNumber)){
                if(account.getAccountBalance()<amount){
                    throw new Exception("El deposito no puede ser negativo");
                }
                account.setAccountBalance(account.getAccountBalance()-amount);
                return;
            }
        }
        throw new Exception("La cuenta no existe");
    }
}
