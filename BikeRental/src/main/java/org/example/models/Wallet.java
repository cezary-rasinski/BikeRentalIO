package org.example.models;


public class Wallet {
    private String id;
    private float balance;

    void updateBalance(TopUpMachine machine, float cash, User user){
        if (machine.id.equals(user.location)){
            balance += cash;
        }
        else {
            System.out.println("User is not near this top-up machine");
        }
    }
    void showBalance(){
        System.out.println("Current balance = " + balance);
    }
//    void byBlik(String userBlik, String BLIK){
//
//    }
}
