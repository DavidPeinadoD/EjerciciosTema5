package org.example;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";

        while (!palabra.endsWith("#")) {
            System.out.println("Introduce una palabra sin acento y en minúsculas, seguida de #:");
                palabra = sc.next();

            // quitamos el último carácter (#)
            if (palabra.endsWith("#")) {
                palabra = palabra.substring(0, palabra.length() - 1);

                // comprobamos si la palabra es un palíndromo
                boolean esPalindromo = true;
                for (int i = 0; i < palabra.length() / 2; i++) {
                    if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                        esPalindromo = false;
                        break;
                    }
                }

                if (esPalindromo) {
                    System.out.println("La palabra " + palabra + " es un palíndromo.");
                } else {
                    System.out.println("La palabra " + palabra + " no es un palíndromo.");
                }
            } else {
                System.out.println("La palabra no es válida");
            }
        }
    }
}


