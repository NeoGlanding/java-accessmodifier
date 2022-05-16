package com.ihsan.accessmodifier;


public class Main {
    public static void main(String[] args) {
        Account ihsan = new Account("IHsan", "202020A");
        ihsan.deposits(200.00);
        ihsan.deposits(200.00);
        ihsan.withdrawal(100.00);
        ihsan.accountInfo();
    }
}
