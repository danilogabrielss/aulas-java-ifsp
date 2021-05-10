package tp01ex03;

import java.util.Scanner;

public class TP01Ex03 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado
        Scanner teclado = new Scanner (System.in);
        int diagonal, area;
        System.out.print("Digite o valor da diagonal:");
        diagonal = teclado.nextInt();
        area = (diagonal*diagonal) / 2;
        System.out.println("O valor da area é " + area);
    }
    
}
