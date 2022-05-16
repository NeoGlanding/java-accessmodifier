package com.ihsan.accessmodifier;

import java.util.ArrayList;
import java.util.Iterator;

class Account {
    private static int instanceNo;
    private String name;
    private ArrayList<Double> trans_action = new ArrayList<>();
    private String accountNumber;

    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.instanceNo++;
    }

    public void deposits(double amount) {
        String message;
        if (amount < 0) {
            message = "Cannot deposits less than 0";
        } else {
            this.trans_action.add(amount);
            message = "Success deposits " + amount;
        }
        System.out.println(message);
    }

    public void withdrawal(double amount) {
        String message;
        Double withdrawalAmount = -amount;

        if (withdrawalAmount > 0) {
            message = "Cannot withdrawal more than 0";
        } else if (this.getBalance() <= 0) {
            message = "Your account isn't sufficent enough to withdrawal";
        } else {
            this.trans_action.add(withdrawalAmount);
            message = "Success withdrawal " + amount;
        }
        System.out.println(message);
    }

    public Double getBalance() {
        Double balance = 0.00;
        Iterator iter = this.trans_action.iterator();
        while (iter.hasNext()) {
            balance += (double) iter.next();
        }
        return balance;
    }

    public void accountInfo() {
        System.out.println(accountNumber + " as " + this.name + " has balance " + this.getBalance());
    }
}
