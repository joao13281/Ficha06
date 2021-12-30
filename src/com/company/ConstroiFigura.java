package com.company;

public  class ConstroiFigura{


    public static void main(String[] args) {

      Quadrado q1 = new Quadrado();
      q1.setLado(2);
      q1.calcularArea();
      q1.calcularPerimetro();
      q1.calcularBase();
      q1.calcularAltura();
      q1.setNome();

      Retangulo r1 = new Retangulo();
      r1.setBase(5);
      r1.setAltura(3);
      r1.calcularArea();
      r1.calcularPerimetro();
      r1.calcularBase();
      r1.calcularAltura();

      Quadrado[] quadrados = new Quadrado[1];
      quadrados[0] = q1;

      Retangulo[] retangulos = new Retangulo[1];
      retangulos[0] = r1;

      for (Quadrado quadrado : quadrados) {
        System.out.println("------------------");
        System.out.println(quadrado.setNome());
        System.out.println("Area: " + quadrado.calcularArea());
        System.out.println("Perimetro: " + quadrado.calcularPerimetro());
        System.out.println("Base: " + quadrado.calcularBase());
        System.out.println("Altura: " + quadrado.calcularAltura());

        for(Retangulo retangulo : retangulos){
          System.out.println("------------------");
          System.out.println(retangulo.setNome());
          System.out.println("Area: " + retangulo.calcularArea());
          System.out.println("Perimetro: " + retangulo.calcularPerimetro());
          System.out.println("Base: " + retangulo.calcularBase());
          System.out.println("Altura: " + retangulo.calcularAltura());

        }
      }
    }
}
