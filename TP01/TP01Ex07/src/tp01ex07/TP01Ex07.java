package tp01ex07;

import java.util.Scanner;

public class TP01Ex07 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
        Scanner t = new Scanner(System.in);
        double n1,n2, media;
        System.out.print("Digite um valor: ");
        n1 = t.nextInt();
        System.out.print("Digite outro valor: ");
        n2 = t.nextInt();
        media = Math.sqrt(n1*n2);
        System.out.println("A média geometrica é " + media);
        
    }
    
}
