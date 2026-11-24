package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    double karat;

    public Jewelry(String name, double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return  marketValue;
    }
}
