package org.example.before;

/**
     * 商店
     */
    public class Shop{
        public void sale(Customer customer, int price){
            if(customer.getCard().balance >= price){
                customer.getCard().balance -= price;
                System.out.println("购买成功");
            }else{
                System.out.println("购买失败");
            }
        }
    }