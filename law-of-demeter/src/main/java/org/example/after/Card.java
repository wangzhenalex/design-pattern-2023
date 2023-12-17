package org.example.after;

/**
 * 银行卡
 */
public class Card {
    /**
     * 余额
     */
    private float  balance;

    public void deduct(float price){
        balance -= price;
    }
}
