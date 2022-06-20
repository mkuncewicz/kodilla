package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("OK!");
        }else {
            System.out.println("Error!");
        }


        System.out.println("Dodawanie 5+2= " + Calculator.add(5,2));
        System.out.println("Odejmowanie 16-31= " + Calculator.subtract(16,31));

    }
}
