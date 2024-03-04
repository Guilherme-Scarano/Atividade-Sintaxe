package br.medianotas;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de alunos da turma: ");
        int numAlunos = scanner.nextInt();
        
        // Criando o vetor para armazenar as notas dos alunos
        double[] notas = new double[numAlunos];
        
        // Solicitando e armazenando as notas dos alunos
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // Calculando a média das notas
        double somaNotas = 0;
        for (int i = 0; i < numAlunos; i++) {
            somaNotas += notas[i];
        }
        double media = somaNotas / numAlunos;
        
        // Exibindo a média das notas
        System.out.println("A média das notas da turma é: " + media);
        
        scanner.close();
    }
}