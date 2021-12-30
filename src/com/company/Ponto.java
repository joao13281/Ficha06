package com.company;

public class Ponto {

    protected double x, y;
    //contrutores
    public Ponto() {
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //metodos
    public void setPonto(double a, double b){
        x = a;
        y = b;
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

    public String printPonto(){
        return "[" + x + "," + y + "]";
    }
}
