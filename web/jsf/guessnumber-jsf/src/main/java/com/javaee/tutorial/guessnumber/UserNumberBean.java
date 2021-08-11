package com.javaee.tutorial.guessnumber;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@SessionScoped
@Named
public class UserNumberBean implements Serializable {
    Integer randomInt =  null;
    Integer userNumber = null;
    String response = null;
    private int maximum = 10;
    private int minimum = 0;

    public UserNumberBean() {
        Random randomGR = new Random();
        randomInt = new Integer(randomGR.nextInt(maximum + 1));
        // Print number to server log
        System.out.println("Duke's number: " + randomInt);
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer user_number) {
        this.userNumber = user_number;
    }

    public String getResponse() {
        if ((userNumber == null) || (userNumber.compareTo(randomInt) != 0)) {
            return "Sorry, " + userNumber + " is incorrect.";
        } else {
            return "Yay! You got it!";
        }
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
