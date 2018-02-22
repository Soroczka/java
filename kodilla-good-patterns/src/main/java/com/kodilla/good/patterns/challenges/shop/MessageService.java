package com.kodilla.good.patterns.challenges.shop;

public class MessageService implements InformationService{
    @Override
    public void inform(Customer customer) {
        System.out.println("Your order is preparing");
    }
}
