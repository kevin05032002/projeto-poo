package org.example;

public class Calculadora {
        public static boolean isPar(int numero) {
            return numero % 2 == 0;
        }

        public static void main(String[] args) {
            int numero = 7;
            System.out.println("O número " + numero + " é par? " + isPar(numero));
        }
    }

