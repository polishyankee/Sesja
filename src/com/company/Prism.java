package com.company;


abstract public class Prism implements Sprzedaj {

    double Volume;
    double BottomField;
    double field;
    double sideField;
    abstract double evaluateVolume();
    abstract double evaluateBottomField();
    abstract double evaluateField();
    abstract double evaluateSideField();

    abstract String getFigureInfo();

    protected String info(){
        return "Prism - funkcja z klasy bazowej";

    }
    void print(){
        System.out.println(getFigureInfo());
        System.out.println("Pole powierzchni podstawy " + BottomField);
        System.out.println("Objetosc figury " + Volume);
        System.out.println("Pole powierzchni calkowitej " + sideField);
        System.out.println("Pole powierzchni bocznej " + sideField);
    }



    @Override
    public void printPrice() {
        System.out.println("Price "+ getPrice() );


    }
}




