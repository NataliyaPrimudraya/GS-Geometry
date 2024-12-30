package com.goodsoft.internship;

import com.goodsoft.internship.geometry.body.*;
import com.goodsoft.internship.geometry.figure.*;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(2);
        square.print();
        Cube cube = new Cube(2);
        cube.print();
    }
}