package tp01ex05;

import java.util.Scanner;

public class TP01Ex05 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
        Scanner teclado = new Scanner(System.in);
        double volume, diametro;
        System.out.print("Digite o valor do diametro: ");
        diametro = teclado.nextInt();
        volume = (4 * Math.PI * (diametro *diametro * diametro)) / 3;
        System.out.println("O valor do volume da esfera é " + volume);
    }    
}