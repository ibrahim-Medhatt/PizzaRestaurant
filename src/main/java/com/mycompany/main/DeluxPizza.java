/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Ibrahim.Medhat
 */
public class DeluxPizza extends Pizza {

    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void takeAway() {
    }

    @Override
    public void addExtraToppings() {
    }

    @Override
    public void addExtraCheese() {
    }

}
