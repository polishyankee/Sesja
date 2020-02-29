package com.company;

import java.util.ArrayList;


public class Main {

    static ArrayList<Prism> mPrism = new ArrayList<>();

    public static void main(String[] args) {
        Cube cube = new Cube(5, 25);
        RectangularPrism rectangularPrism = new RectangularPrism(4, 6, 7, 20);

        mPrism.add(new Cube(5, 25));
        mPrism.add(new RectangularPrism(4, 6, 7, 20));
        mPrism.add(new Cube(12, 55));
        mPrism.add(new RectangularPrism(8, 10, 12, 20));
        mPrism.add(new Sphere(10, 12));
        mPrism.add(new Cube(7,90));


        for (Prism prism : mPrism) {
            prism.print();
 

            for (Prism prism1 : mPrism) {
                prism1.printPrice();
            }
        }
    }
}






