package tp02ex05;

import java.util.Scanner;

public class TP02Ex05 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino         
        //Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
        Scanner t = new Scanner(System.in);
        int i, j;
        int matriz[][] = new int[3][2];

        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 2; ++j) {
                System.out.print("Insira o numero na coluna " + (1 + i) + "x" + (1 + j) + ": ");
                matriz[i][j] = t.nextInt();
            }
        }
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 2; ++j) {
                System.out.print(matriz[i][j] + " ||");
            }
            System.out.println("");
            System.out.println("-----------------");
        }

    }

}
