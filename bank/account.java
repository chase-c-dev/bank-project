package bank;

import util.bankSelector;

import java.util.Scanner;

public class account extends bankReady {


    public account(int cbalance, int sbalance, String CheckingaccName, String SavingaccName) {
        super(cbalance, sbalance, CheckingaccName, SavingaccName); //initializes variables from bankReady
    }

    public void checking(int total) { //stores new balance each time as parameter
        bankReady bankReady = new bankReady(0, 0, "", "");
        bankReady.setCbalance(total); //stores balance as cbalance each run before running if statements
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to withdraw, deposit or see your balance?");
        System.out.println("Type in d for deposit, w for withdraw, b for balance or e to exit back to main menu");
        String answer = input.next(); //gets input from user
        if (answer.equals("d")) { //checks to see if user wants to deposit
           Scanner dep = new Scanner(System.in);
           System.out.println("Type in amount you want to deposit");
           int total1 = dep.nextInt(); //saves deposit amount in total1
           bankReady.setCbalance(total1 + total); //deposit to current balance
            System.out.println(bankReady.getCbalance());
           checking(bankReady.getCbalance()); //reruns checking and stores current balance as parameter
        }

        if (answer.equals("w")) { //checks to see if user wants to withdraw
            Scanner with = new Scanner(System.in);
            System.out.println("Type in the amount you want to withdraw");
            int total2 = with.nextInt(); //turns it into a negative so when the setter adds it, it takes away
            bankReady.setCbalance(total-total2); //sets cbalance variable, subtracts withdraw amount from total balance
            System.out.println(total2 + " was withdrawed from your account");
            checking(bankReady.getCbalance()); //reruns checking and stores current balance as parameter
        }

        if (answer.equals("b")) { //checks to see if user wants to see balance
            System.out.println("Your balance is " + bankReady.getCbalance()); //displays users checking account balance
            checking(bankReady.getCbalance()); //reruns checking and stores current balance as parameter
        }

        if (answer.equals("e")) { //checks to see if user wants to exit
            bankSelector bankSelector = new bankSelector();
            bankSelector.startUP(); //returns user to main menu
        }


    }

    public void savings(int counter) {
        bankReady bankReady = new bankReady(0, 0, "", "");
        bankReady.setSbalance(counter); //sets bank balance to function parameter
        Scanner input1 = new Scanner(System.in);
        System.out.println("Do you want to withdraw, deposit or see your balance?");
        System.out.println("Type in d for deposit, w for withdraw, b for balance or e to exit back to main menu");
        String tell = input1.next(); //gets user input
        if (tell.equals("d")) { //checks to see if user wants to deposit
            Scanner put = new Scanner(System.in);
            System.out.println("Type in amount you want to deposit");
            int total3 = put.nextInt(); //sets total3 equal to deposit amount
            bankReady.setSbalance(counter + total3); //adds deposit to total balance
            System.out.println(bankReady.getSbalance()); //prints out new balance
            savings(bankReady.getSbalance()); //reruns method with new balance
        }
        if (tell.equals("w")) { //checks to see if user wants to withdraw
            Scanner pull = new Scanner(System.in);
            System.out.println("Type in the amount you want to withdraw");
            int total4 = pull.nextInt(); //sets total4 equal to withdraw amount
            bankReady.setSbalance(counter-total4); //subtracts withdraw amount from total balance
            System.out.println(total4 + "was withdrawed from the account"); //prints user amount withdrawed
            savings(bankReady.getSbalance()); //reruns method with new balance
        }
        if (tell.equals("b")) { //checks users balance
            System.out.println("Your balance is " + bankReady.getSbalance()); //prints current balance
            savings(bankReady.getSbalance()); //reruns method with balance
        }
        if (tell.equals("e")) { //checks to see if user wants to exit
            bankSelector bankSelector = new bankSelector();
            bankSelector.startUP(); //returns to user menu
        }
    }

}
