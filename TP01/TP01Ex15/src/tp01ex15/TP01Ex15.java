package tp01ex15;

import java.util.Scanner;

public class TP01Ex15 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino        
        //15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$). 
        Scanner t = new Scanner (System.in);
        double real, dolar, cotacao;
        System.out.print("Digite o valor da cotacao do dolar: ");
        cotacao = t.nextDouble();
        System.out.print("Digite o valor a ser convertido para Real: ");
        dolar = t.nextDouble();
        real = dolar * cotacao;
        System.out.println("O valor em real é " + real);
    }
    
}
