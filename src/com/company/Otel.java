package com.company;

import java.util.Arrays;

public class Otel implements Interface{
    private String adres;
    private Famil[] famils;

    @Override
    public void pay() {
        System.out.println("arenda toloit");

    }

    public Otel(String adres, Famil[] famils) {
        this.adres = adres;
        this.famils = famils;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Famil[] getFamils() {
        return famils;
    }

    public void setFamils(Famil[] famils) {
        this.famils = famils;
    }

    @Override
    public String toString() {
        return "Otel{" +
                "adres='" + adres + '\'' +
                ", famils=" + Arrays.toString(famils) +
                '}';
    }
}

