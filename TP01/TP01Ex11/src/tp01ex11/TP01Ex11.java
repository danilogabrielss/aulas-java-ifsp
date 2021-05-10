package tp01ex11;

import java.util.Scanner;

public class TP01Ex11 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
        Scanner t = new Scanner (System.in);
        double diametro, area;
        System.out.print("Digite o valor do diametro: ");
        diametro = t.nextInt();
        area = Math.PI * diametro;
        System.out.println("A area do circulo é " + area);
    }    
}