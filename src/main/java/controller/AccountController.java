package controller;

import accounts.Account;

import java.math.BigDecimal;

public class AccountController {

    public void deposit(Account account, BigDecimal amount){
        switch (account.getAccountType()){
            case("current-account"), ("saving-account") -> {
                //compare to is check value -1 lessthan 0 equals 1 morethan
                if (amount.compareTo(new BigDecimal(0)) > 0 && account.getCurrentBalance().compareTo(amount) >= 0) {
                    BigDecimal currentBalance = account.getCurrentBalance();
                    account.setCurrentBalance(currentBalance.add(amount));
                } else {
                    System.out.println("Error, try again");
                }
            }
            case("fixed-deposit-account") -> {
                System.out.println("Can not withdraw this account.");
            }
        }
    }
    public void withdraw(Account account, BigDecimal amount) {
        switch (account.getAccountType()){
            case("current-account"), ("saving-account") -> {
                //compare to is check value -1 lessthan 0 equals 1 morethan
                if (amount.compareTo(new BigDecimal(0)) > 0 && account.getCurrentBalance().compareTo(amount) >= 0) {
                    BigDecimal currentBalance = account.getCurrentBalance();
                    account.setCurrentBalance(currentBalance.subtract(amount));
                } else {
                    System.out.println("Error, try again");
                }
            }
            case("fixed-deposit-account") -> {
                System.out.println("Can not withdraw this account.");
            }
        }
    }
}
