package com.goodsoft.internship;

import com.goodsoft.internship.geometry.body.*;
import com.goodsoft.internship.geometry.figure.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(BigDecimal.valueOf(2.48));
        square.print();
        Cube cube = new Cube(BigDecimal.valueOf(2.48));
        cube.print();
    }
}