package com.tns.Stringprograms;

abstract class Graphic {

    abstract void draw();

    void resize() {

            System.out.println("Resizing graphic");

    }

}

class Circle extends Graphic {

    void draw() {

            System.out.println("Drawing circle");

    }

}

