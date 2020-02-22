package com.company;

public class RectangularPrism extends Prism implements Sprzedaj {
    double a,b,c;
    double unitPrice;

    RectangularPrism(double a, double b, double c, double unitPrice) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.unitPrice = unitPrice;

        evaluateVolume();
        evaluateBottomField();
        evaluateField();
        evaluateSideField();
    }

    @Override
    double evaluateVolume() {
        this.Volume= a*b*c;
        return Volume;
    }

    @Override
    double evaluateBottomField() {
        this.BottomField = a*b;
        return BottomField;
    }
    @Override
    double evaluateSideField() {
        this.sideField = 2*(b*c)+ 2*(a*c);
        return sideField;
    }
    @Override
    double evaluateField() {
        this.field = 2* BottomField + sideField;
        return field;
    }
    @Override
    String getFigureInfo() {
        return "RectangularPrism";
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
        return unitPrice * Volume;
    }

    @Override
    public void printPrice() {
        System.out.println("Price " + getPrice());
    }
}
