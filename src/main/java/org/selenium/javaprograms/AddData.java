package org.selenium.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class AddData {
    ArrayList<String> addValue() {
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Onion");
        vegetables.add("Tomato");
        vegetables.add("Potato");
        return vegetables;
    }
    /*public void addVegetablesRate(){
        List<String> vegetableList = new ArrayList<>();

        // Add vegetables and their prices to the list
        vegetableList.add(new Vegetable("Onion", 50));
        vegetableList.add(new Vegetable("Tomato", 20));
        vegetableList.add(new Vegetable("Potato", 10));
    }*/
    /*private static int addVegetablesRate(List<Vegetable> vegetables) {
        // public static void main (String[]args){
        // Create a list to store vegetable names and prices
        List<Vegetable> vegetableList = new ArrayList<>();

        // Add vegetables and their prices to the list
        vegetableList.add(new Vegetable("Onion", 50));
        vegetableList.add(new Vegetable("Tomato", 20));
        vegetableList.add(new Vegetable("Potato", 10));


          //  int totalPrice = calculateTotalPrice(vegetableList);*//*

        // Print the total price
       // System.out.println("Total price of vegetables: " + totalPrice);
       // }
   // }*/

    public static void main(String[] args) {
        AddData data =new AddData();
        data.addValue();
        System.out.println("ArrayList:" +data.addValue());
        int size = data.addValue().size();
        System.out.println("No:of vegetables:" +size);
    }
}







