package com.exercices;

public class Ejercicio02B {

     /*
        Cálculo del precio de un producto con iva incluído
        utilizando una función la cual recibe unos parámetros

     */

    public static void main(String[] args) {

            float precioIva = calculoIva(148.25f, 21);
            System.out.println("El precio del producto con iva es de" + " " + precioIva + " €");

    }
            static float calculoIva(float precio, float iva) {
                return precio + (precio * iva / 100);
    }

    }







