package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int totalBill;

    boolean cheese;
    boolean topping;

    boolean takeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price = 300;
        }else {
            price = 400;
        }
      bill = "Base Price Of The Pizza: "+price+"\n";
        totalBill+=price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here


        if(!cheese){
            totalBill+=80;
            cheese = true;
        }


    }

    public void addExtraToppings(){
        // your code goes here


        if(!topping && isVeg){
            totalBill+=70;

        }else if (!topping && !isVeg){
            totalBill+=120;
        }
        topping = true;
    }

    public void addTakeaway(){
        // your code goes here


        if(!takeaway){
            totalBill+=20;
        }
    }

    public String getBill(){
        // your code goes here
        boolean billGenerated = false;
        if (!billGenerated) {
            if (cheese) {
                bill += "Extra Cheese Added: 80 \n";
            }
            if (topping && isVeg) {
                bill += "Extra Toppings Added: 70 \n";
            } else if (topping && !isVeg) {
                bill += "Extra Toppings Added: 120 \n";
            }

            if (takeaway) {
                bill += "Paperbag Added: 20 \n" ;
            }
            bill+= "Total Price: "+totalBill+"\n";
            billGenerated = true;
        }

        return this.bill;


    }




}
