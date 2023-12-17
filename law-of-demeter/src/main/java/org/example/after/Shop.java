package org.example.after;

/**
     * 商店
     */
    public class Shop{
        public void sale(Customer customer, float price){
            customer.pay(price);
        }
    }