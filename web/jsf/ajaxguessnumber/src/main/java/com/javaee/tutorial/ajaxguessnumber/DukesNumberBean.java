package com.javaee.tutorial.ajaxguessnumber;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named
@SessionScoped
public class DukesNumberBean implements Serializable {
    private Integer randomInt = null;
    private long maximum = 10;
    private long minimum = 0;

    public DukesNumberBean() {
        Random randomGR = new Random();
        long range = maximum + minimum + 1;
        randomInt = (int) (minimum + randomGR.nextDouble() * range);
        System.out.println("Duke's number: " + randomInt);
    }

    public long getMaximum() {
        return (this.maximum);
    }

    public void setMaximum(long maximum) {
        this.maximum = maximum;
    }

    public long getMinimum() {
        return (this.minimum);
    }

    public void setMinimum(long minimum) {
        this.minimum = minimum;
    }

    /**
     * @return the randomInt
     */
    public Integer getRandomInt() {
        return randomInt;
    }

    /**
     * @param randomInt the randomInt to set
     */
    public void setRandomInt(Integer randomInt) {
        this.randomInt = randomInt;
    }
}
