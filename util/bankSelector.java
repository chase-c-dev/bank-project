package util;
import bank.account;

import java.util.Scanner;
public class bankSelector {

    public void startUP() { //runs when program is first run or if incorrect input is put in bankAsk
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the bank");

        System.out.println("What type of account do you want to access");
        System.out.println("Type c for checking or s for savings or e to exit the bank");

        String accountType = input.next();
        if (accountType.equals("e")) return; //ends program if user wants to exit bank
        bankAsk(accountType);
    }

    public void bankAsk(String accountType) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your Checking account name");
        String checkaccname = name.next(); //gets checking account name from user
        System.out.println("Enter your Savings account name"); //gets savings account name from user
        String saveaccname = name.next();
        if (accountType.equals("c")) {
            account account  = new account(0, 0, checkaccname, saveaccname); //creates new object
            account.checking(0); //Starts checking account
        }
        if (accountType.equals("s")) {
            account account  = new account(0, 0, checkaccname, saveaccname); //creates new object
            account.savings(0); //Starts savings account
        }
    }

}
