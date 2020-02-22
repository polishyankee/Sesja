package com.company;

import java.lang.reflect.Field;

public class Sphere extends Prism implements Sprzedaj {
    double unitPrice;
    double r;

    Sphere(double r, double unitPrice)
    {
        this.r= r;
        this.unitPrice = unitPrice;

        evaluateVolume();
        evaluateBottomField();
        evaluateField();
        evaluateSideField();
    }


    @Override
    double evaluateVolume() {
        this.Volume = 4/3 *Math.PI*r*r*r;
        return Volume ;
    }

    @Override
    double evaluateBottomField() {
        return 0;
    }

    @Override
    double evaluateField()
    {
        this.field = 4*Math.PI*r*r;
        return field;
    }

    @Override
    double evaluateSideField() {
        return 0;
    }

    @Override
    String getFigureInfo() {
        return "Sphere";
    }

    @Override
    public double getPrice() {
        return unitPrice*Volume;
    }
    public void printPrice() {
        System.out.println("Price: " + getPrice());
    }

}
