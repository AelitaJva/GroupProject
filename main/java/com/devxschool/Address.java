package com.devxschool;

public class Address {

    public static void main(String[] args) {

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */


        //TODO WRITE YOUR CODE HERE
        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";
        System.out.println("Address: " + getStreetAddress(address));
        System.out.println("City: " + getCity(address));
        System.out.println("State: " + getStreetAddress(address));
        System.out.println("Zipcode: " + getZipcode(address));
    }


    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {
        return address.substring(0, 22);
    }

    public static String getCity(String address) {
        return address.substring(22, 35 );

    }

    public static String getState(String address) {
        return address.substring(35, 38);
    }

    public static String getZipcode(String address) {
        return address.substring(38);
    }
}
