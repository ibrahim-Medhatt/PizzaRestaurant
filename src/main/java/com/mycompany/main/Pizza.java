/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Ibrahim.Medhat
 */
public class Pizza {

    private int price;
    private boolean veg;

    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 150;
    private final int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza() {

    }

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
//        System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
//        System.out.println("Extra toppings Added");
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
//        System.out.println("Order Is Take Away ");
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza :" + basePizzaPrice);

        if (isExtraCheeseAdded) {
            bill += "Extra Chesse Added :" + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added :" + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take Away :" + backPackPrice + "\n";
        }
        bill += "Bill:" + this.price + "\n";
        System.out.println(bill);
    }

}
/*
Base pizza = 300
Toppings = 150
Cheese = 100 
Take Away =20 
 */
