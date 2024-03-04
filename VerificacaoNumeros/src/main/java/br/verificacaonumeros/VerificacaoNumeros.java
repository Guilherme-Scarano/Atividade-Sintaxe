package br.verificacaonumeros;
import java.util.Scanner;

public class VerificacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, insira três números inteiros:");
        System.out.print("Número 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Número 3: ");
        int num3 = scanner.nextInt();
        
        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        
        System.out.println("O maior número é: " + maior);
        
        verificarPositivoNegativoOuZero(num1);
        verificarPositivoNegativoOuZero(num2);
        verificarPositivoNegativoOuZero(num3);
        
        scanner.close();
    }
    
    public static void verificarPositivoNegativoOuZero(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo.");
        } else {
            System.out.println(numero + " é igual a zero.");
        }
    }
}