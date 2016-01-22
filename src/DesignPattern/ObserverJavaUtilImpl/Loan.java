package DesignPattern.ObserverJavaUtilImpl;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

class Loan extends Observable {// Being Watched

    private String type;
    private float interest;
    private String bank;

    public Loan(String type, float interest, String bank) {
           this.type = type;
           this.interest = interest;
           this.bank = bank;
    }

    public float getInterest() {
           return interest;
    }

    public void setInterest(float interest) {
           this.interest = interest;
           setChanged();
           notifyObservers(interest);
    }

    public String getBank() {
           return this.bank;
    }

    public String getType() {
           return this.type;
    }


}
