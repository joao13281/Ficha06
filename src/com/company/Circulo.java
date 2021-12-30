package com.company;

public class Circulo {

    private double raio;
    private double x, y;


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //construtores
    public Circulo() {}

    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    //metodos da classe
    public double calculaPerimetro(){
        return 2 * Math.PI * raio ;
    }
    public double calculaArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    double aumentaRaio(double aum){

        return raio + aum;
    }

    double diminuiRaio(double dim){
        return raio - dim;

    }
    public void verificaRaio(double raio2){

        if (this.raio > raio2){
            System.out.println("Raio 1 é maior que raio 2");
        }else {
            System.out.println("Raio 1 menor que raio 2");
        }
    }






}


