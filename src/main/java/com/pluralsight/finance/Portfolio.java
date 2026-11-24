package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    String name;
    String owner;
    List<Valuable> assets = new ArrayList<>();

    public List<Valuable> getItems() {
        return assets;
    }

    /*
    The getMostValuable() method should return the asset that has the highest
    value.
    The getLeastValuable() method should return the asset that has the lowest
    value, possibly a credit card with the highest balance.
     */
    public Valuable getMostValuable() {
        Valuable mostValuable = null;
        for (Valuable valuable : assets) {
            if (mostValuable == null) {
                mostValuable = valuable;
            } else if (valuable.getValue() > mostValuable.getValue()) {
                mostValuable = valuable;
            }
        }
        return mostValuable;
    }
    public Valuable getLeastValuable() {
        Valuable leastValuable = null;
        for (Valuable valuable : assets) {
            if (leastValuable == null) {
                leastValuable = valuable;
            } else if (valuable.getValue() < leastValuable.getValue()) {
                leastValuable = valuable;
            }
        }
        return leastValuable;
    }

}
