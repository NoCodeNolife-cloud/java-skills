package com.code;

public class Main {

    public static void main(String[] args) {
	    System.out.println(Account.interestRate);
	    System.out.println(Account.interestBy(1000));

	    Account myAccount=new Account();
	    myAccount.amount=1000000;
	    myAccount.owner="Tony";

	    System.out.println(myAccount.messageWith(1000));
	    System.out.println(myAccount.interestRate);
    }
}
