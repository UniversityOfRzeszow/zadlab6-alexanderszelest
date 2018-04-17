/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z3;

import java.util.Scanner;

/**
 *
 * @author Pan Szelest
 */
public class Complex {

    private double re;
    private double im;

    public Complex() {
        this(0, 0);
    }

    public Complex(double re) {
        this(re, 0);

    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;

    }

    public double Modul() {
        return Math.pow(Math.pow(re, 2) + Math.pow(im, 2), 1 / 2);
    }

    public Complex Sprzezenie() {
        return new Complex(re, -im);
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }

    public Complex Dodawanie(Complex druga) {
        double re = this.re + druga.re;
        double im = this.im + druga.im;
        return new Complex(re, im);
    }

    public Complex Odejmowanie(Complex druga) {
        double re = this.re - druga.re;
        double im = this.im - druga.im;
        return new Complex(re, im);
    }

}
