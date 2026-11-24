package com.pluralsight.finance;

public class House extends FixedAsset{
    int yearBuilt, squareFeet, bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return  marketValue;
    }
}
