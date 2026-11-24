package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    String name;
    double marketValue;

    public void Asset(String name, double marketValue) {

    }

    public double getValue() {
        return  marketValue;
    }

}
