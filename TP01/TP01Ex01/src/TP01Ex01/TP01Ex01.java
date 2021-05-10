package TP01Ex01;

import java.util.Scanner;

public class TP01Ex01 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área
        Scanner teclado = new Scanner(System.in);
        int base, altura, area;
        System.out.print("Digite o valor da base: ");
        base = teclado.nextInt();
        System.out.print("Digite o balor da altura: ");
        altura = teclado.nextInt();
        area = base * altura;
        System.out.println("O valor da area do retangulo é " + area);
    }
}
