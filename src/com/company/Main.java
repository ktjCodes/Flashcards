package com.company;

public class Main {

    public static void main(String[] args) {
	    Card card1 = new Card();
	    card1.setName("DHCP Discover");
	    card1.setDefinition("Checks to make sure there are servers up for an ip to be requested from.");

        System.out.println(card1.getName());
        System.out.println(card1.getDefinition());
    }
}
