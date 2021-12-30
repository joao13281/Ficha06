package com.company;

public class Quadrado extends Ponto implements Funcoes {

    protected int lado;


    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
        //   return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado + lado + lado + lado;
    }

    @Override
    public double calcularBase() {
        return lado;
    }

    @Override
    public double calcularAltura() {
        return lado;
    }

    @Override
    public String setNome() {
        return "Quadrado";
    }


}
