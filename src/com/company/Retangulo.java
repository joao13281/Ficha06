package com.company;

public class Retangulo extends Ponto implements Funcoes{
    private double base;
    private double altura;


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public double calcularBase() {
        return base;
    }

    @Override
    public double calcularAltura() {
        return altura;
    }

    @Override
    public String setNome() {
        return "Retangulo";
    }
}
