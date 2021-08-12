package com.javaee.tutorial.ajaxguessnumber;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UserNumberBean implements Serializable {

    @Inject
    DukesNumberBean dukesNumberBean;
    private Integer userNumber = null;
    String response = null;

    public void setUserNumber(Integer user_number) {
        userNumber = user_number;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public String getResponse() {
        if ((userNumber != null)
                && (userNumber.compareTo(dukesNumberBean.getRandomInt()) == 0)) {
            return "Yay! You got it!";
        }
        if (userNumber == null) {
            return null;
        } else {
            return "Sorry, " + userNumber + " is incorrect.";
        }
    }
}
