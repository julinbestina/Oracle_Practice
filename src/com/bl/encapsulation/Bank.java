package com.bl.encapsulation;

public class Bank {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setAcc_no(7310805450L);
        acc.setName("Julin");
        acc.setEmail("julin.a@gmail.com");
        acc.setAmount(100000f);
        System.out.println("Account Number :" + acc.getAcc_no() );
        System.out.println("Account holder Name : " + acc.getName());
        System.out.println("Email id : " + acc.getEmail());
    }
}
