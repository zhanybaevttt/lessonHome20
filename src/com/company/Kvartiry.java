package com.company;

import java.util.Arrays;

public class Kvartiry implements Interface {


    private String adress;
    private Famil[] famils;



    @Override
    public void pay() {
        System.out.println("Arenda toloit");

    }

    public Kvartiry(String adress, Famil[] famils) {
        this.adress = adress;
        this.famils = famils;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Famil[] getFamils() {
        return famils;
    }

    public void setFamils(Famil[] famils) {
        this.famils = famils;
    }

    @Override
    public String toString() {
        return "Kvartiry{" +
                "adress='" + adress + '\'' +
                ", famils=" + Arrays.toString(famils) +
                '}';
    }
}


