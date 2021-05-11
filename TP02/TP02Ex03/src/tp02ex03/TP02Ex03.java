package tp02ex03;

import java.util.Scanner;

public class TP02Ex03 {

    public static void main(String[] args) {
        //Danilo Gabriel 
        //Gabriel Paulino 
        //Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir: 
        Scanner t = new Scanner(System.in);
        int n, maiorValor = 0, menorValor = 0, somaValores = 0, media, i, nPositivos = 0, nNegativos = 0;
        int n2[];
        n2 = new int[95];

        System.out.print("Digite um numero: ");
        n = t.nextInt();

        while (n > 20) {
            System.out.println("ERRO! O numero digitado nao pode seer negativo ou acima de 20.");
            System.out.print("Digite um numero: ");
            n = t.nextInt();
        }

        for (i = 0; i < n; ++i) {
            System.out.print("Digite o " + (1+ i) + " numero: ");
            n2[i] = t.nextInt();
            n2[i] += somaValores;
            if (maiorValor >= n2[i]) {
                n2[i] = maiorValor;
            } else if (menorValor < n2[i]) {
                n2[i] = menorValor;
            }
            if (n2[i] > 0) {
                nPositivos = nPositivos + 1;
            } else if (n2[i] < 0) {
                nNegativos = nNegativos + 1;
            }
        }
        media = somaValores / n;

        System.out.println(n2[1]);

        System.out.print("O maior valor é " + maiorValor + ", o menor valor é " + menorValor + ", a média dos valores é " + media + " numeros positivos " + nPositivos + " numeros negativos " + nNegativos);

    }

}
