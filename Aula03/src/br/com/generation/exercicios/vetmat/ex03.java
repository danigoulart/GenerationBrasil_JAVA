//Faça um programa que entre com três números e coloque em ordem crescente./


import java.util.Scanner;
import java.util.Arrays;

public class ex03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        long[] num = new long[3];

        System.out.println("Digite um número: ");
        num[0] = entrada.nextLong();

        System.out.println("Digite mais um número: ");
        num[1] = entrada.nextLong();

        System.out.println("Digite o último número: ");
        num[2] = entrada.nextLong();

        boolean flag; 

        do {
             flag = false; 
                                 //length lê o tamanho do vetor
            for(int i=0; i < num.length - 1; i++) {

              if (num[i] > num[i + 1]) {

                  long aux = num[i];
                  num[i] = num[i + 1];
                  num[i + 1] = aux;

                  flag = true;
              }
            }
        } while (flag);

        System.out.println("Os números digitados na ordem crescente são: " + Arrays.toString(num));

    }
}