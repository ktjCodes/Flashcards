package main.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* //UI implementation -----> Coming Soon
           //Need Servers to store data OR CAN STORE LOCALLY
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the term for the card: ");
        String Term = input.nextLine();
        System.out.println("Enter the Definition for the card: ");
        String Definition = input.nextLine();
        */
        Card card1 = new Card("DHCP", "Ensures that ip's are assigned dynamically from clients to live servers");

        System.out.println(card1.getName() + "\n");
        System.out.println(card1.getDefinition());
    }
}
