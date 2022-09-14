package com.maveric.bankapp;


public class SavingAccount extends BankAccount {
	public static final long MINIMUM_BALANCE = BankConstants.SAVING_ACCOUNT_MINIMUM_BALANCE;
    public static final double INTEREST_RATE = BankConstants.SAVING_ACCOUNT_INTEREST_RATE;

    public long getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

    public double getInterestRate() {
        return INTEREST_RATE;
    }

    public String getType() {
        return BankAccountType.SAVINGS.toString();
    }
}