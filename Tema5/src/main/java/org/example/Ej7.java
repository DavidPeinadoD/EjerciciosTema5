package org.example;

public class Ej7 {
    //haz una matriz de 20x30 en la que se muestren # de manera aleatoria en la matriz e imprime la matriz
    public static void main(String[] args) {
        int[][] matriz = new int[20][30];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
