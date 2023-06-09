package main;

import java.util.Random;
import java.util.Scanner;

public class mainTest {

    static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        while(true){
            System.out.println("Test_Method");
            System.out.println("Type 0 to exit.");
            System.out.println("1.test Open account");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case (1) -> {
                    testOpeningAccount();
                }
                case (0) -> {
                    System.exit(0);
                }
                default -> {}
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
//            case (1) -> {
//                LocalDateTime time = LocalDateTime.now();
//                Account account = new CurrentAccount(randomID(), new Customer(), time, BigDecimal.valueOf(1000), BigDecimal.valueOf(0.5));
//            }
        }

    }
    private static int randomID() {
    Random ran = new Random();
    return ran.nextInt(100,999);
    }
}
