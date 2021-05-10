package tp01ex17;

import java.util.Scanner;

public class TP01Ex17 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
        Scanner t = new Scanner (System.in);
        double x, y, z, a;
        System.out.print("Digite o valor de X: ");
        x = t.nextDouble();
        System.out.print("Digite o valor de Y: ");
        y = t.nextDouble();
        z = Math.pow(x, y);
        System.out.println("O valor da potencia de X elevado a Y é " + z);
    }
    
}
