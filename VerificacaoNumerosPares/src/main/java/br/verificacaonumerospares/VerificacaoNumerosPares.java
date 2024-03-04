package br.verificacaonumerospares;

public class VerificacaoNumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares no intervalo de 1 a 100:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}