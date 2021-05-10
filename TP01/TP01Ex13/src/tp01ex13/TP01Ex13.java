package tp01ex13;

import java.util.Scanner;

public class TP01Ex13 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //13.Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso (em s) que serão digitados. 
        Scanner t = new Scanner (System.in);
        double vf, vi, ace, tmp;
        System.out.print("Digite o valor da velocidade inicial(m/s): ");
        vi = t.nextInt();
        System.out.print("Digite o valor da aceleracao(m/s2) :");
        ace = t.nextInt();
        System.out.print("Digite o valor do tempo do percurso(s): ");
        tmp = t.nextInt();
        vf = vi + ace * tmp;
        vf = 3.6 * vf;
        System.out.println("A velocidade final (km/h): " + vf);
    }
}
