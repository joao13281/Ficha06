package com.company;

public class ConstroiCirculo {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(1.0, 1.0, 5.0);
        c1.calculaArea();
        c1.calculaPerimetro();

        Circulo c2 = new Circulo(5.0, 2.0, 3.0);
        c2.calculaArea();
        c2.calculaPerimetro();

        Circulo[] circulos  = new Circulo[2];
        circulos[0] = c1;
        circulos[1] = c2;

        System.out.println("\n----> Circulo Nº1:");
        System.out.println("Perimetro: " + c1.calculaPerimetro());
        System.out.println("Area: " + c1.calculaArea());
        System.out.println("Raio aumentado: " + c1.aumentaRaio(2.0));

        System.out.println("\n----> Circulo Nº2:");
        System.out.println("Perimetro: " + c2.calculaPerimetro());
        System.out.println("Area: " + c2.calculaArea());
        System.out.println("Raio diminuido: " + c1.diminuiRaio(1.5) + "\n");

        c1.verificaRaio(c2.getRaio());
        c2.verificaRaio(c1.getRaio());
    }
}
