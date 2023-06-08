package main;

import accounts.Account;
import accounts.CurrentAccount;
import person.Customer;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class mainTest {

    static Scanner scan;
    public static void main(String[] args) {

        while(true){
            System.out.println("Test_Method");
            System.out.println("Type 0 to exit.");
            System.out.println("1.testOpen account");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case (1) -> {
                    testOpeningAccount();
                }
            }
        }
    }

    private static void testOpeningAccount(){
        System.out.println("Enter customer name");
        String name = scan.nextLine();
        System.out.println("Enter account type");
        System.out.println("1.Current");
        System.out.println("2.Fixed");
        System.out.println("3.Saving");
        int accType = scan.nextInt();
        scan.nextLine();
        switch (accType){
            case (1) -> {
                Account account = new CurrentAccount(randomID(), new Customer(), LocalDateTime.now(), 1000, 0.5);
            }
        }

    }
    private static int randomID() {
    Random ran = new Random();
    return ran.nextInt(100,999);
    }
}
