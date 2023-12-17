package org.example.after;

/**
     * 顾客
     */
    public class Customer{
        private Card card =new Card();

        public void pay(float fee){
            this.card.deduct(fee);
        }
 }
