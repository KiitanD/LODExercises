package com.qa;

import java.util.Arrays;

public class Account implements Comparable<Account>{
    String[] cardTypes;
    String sortcode;
    String accountNumber;
    String password;

    public Account(String[] cardTypes, String sortcode, String accountNumber, String password) {
        this.cardTypes = cardTypes;
        this.sortcode = sortcode;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String[] getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(String[] cardTypes) {
        this.cardTypes = cardTypes;
    }

    public String getSortcode() {
        return sortcode;
    }

    public void setSortcode(String sortcode) {
        this.sortcode = sortcode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardTypes=" + Arrays.toString(cardTypes) +
                ", sortcode='" + sortcode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(Account o) {

        if (Arrays.stream(this.cardTypes).anyMatch(o.cardTypes[0]::equals)) {
            if (this.sortcode.equals(o.sortcode) && this.accountNumber.equals(o.accountNumber)
            && this.password.equals(o.password)) {
                return 0;
            }

        }
        return -1;
    }
}
