package org.example.uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        int N = scanner.nextInt();
        System.out.println(N);
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
            int quantidade = N / nota;
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidade, nota);
            N = N % nota;
        }
    }
}
