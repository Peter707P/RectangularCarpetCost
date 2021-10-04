package com.company;

public class Main {

    public static void main(String[] args) {

        //it is a simple calculator for rectangular carpets
        //the floor class gives the area of the carpet needed and
        //the carpet class gives you the price for square meter
        //the calculator gives the total cost of the carpet

        Carpet carpet = new Carpet(7.5);
        Floor floor = new Floor(3.5,2.5);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("The total cost of the carpet : " + calculator.getTotalCost());







    }
}
