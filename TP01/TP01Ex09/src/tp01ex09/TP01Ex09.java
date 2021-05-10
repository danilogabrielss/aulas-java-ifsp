package tp01ex09;

import java.util.Scanner;

public class TP01Ex09 {

       public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm
        Scanner t = new Scanner (System.in);
        int V, R, I;
        System.out.print("Digite o valor da resistencia: ");
        R = t.nextInt();
        System.out.print("Digite o valor da corrente: ");
        I = t.nextInt();
        V = R * I;
           System.out.println("O valor da tensão do circuito é " + V);
    }
    
}
