package tp02ex01;

import java.util.Scanner;

public class TP02Ex01 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino 
        //Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
        Scanner t = new Scanner(System.in);
        int n1, n2, i;

        System.out.print("Digite um numero:");
        n1 = t.nextInt();
        System.out.print("Digite um numero:");
        n2 = t.nextInt();
        while (n2 < n1) {
            System.out.println("ERRO! O numero digitado tem que seer maior que o primeiro numero digitado!");
            System.out.print("Digite um numero:");
            n1 = t.nextInt();
        }

    }

}
