package com.company;


public class Cube extends Prism implements Sprzedaj{


    double a;
    double unitPrice;

    Cube(double a, double unitPrice){

        this.a=a;
        this.unitPrice =unitPrice;
        evaluateVolume();
        evaluateBottomField();
        evaluateField();
        evaluateSideField();
    }
    @Override
    double evaluateVolume() {
        this.Volume=a*a*a;
        return Volume;
    }

    @Override
    double evaluateBottomField() {
        this.BottomField = a*a;
        return BottomField ;
    }

    @Override
    double evaluateField() {
        this.field = 6*a*a;
        return field;
    }

    @Override
    double evaluateSideField() {
        this.sideField = 4*a*a;
        return sideField;
    }

    @Override
    String getFigureInfo() {
        return "Cube";
    }

    @Override
    protected String info() {

        return info();
    }

    @Override
    void print() {
        super.print();
    }


    @Override
    public double getPrice() {
        return unitPrice*Volume;

    }

    @Override
    public void printPrice() {
    System.out.println("Price: " + getPrice());
    }
}
