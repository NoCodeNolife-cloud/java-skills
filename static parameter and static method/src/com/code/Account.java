package com.code;

public class Account {

    double amount=0.0;

    String owner;

    static double interestRate=0.0668;

    static public double interestBy(double amt){
        return interestRate*amt;
    }

    public String messageWith(double amt){
        double interest=Account.interestBy(amt);
        StringBuilder sb=new StringBuilder();
        sb.append(owner).append("的利息是").append(interest);
        return sb.toString();
    }
}
