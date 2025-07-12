// Exercicio 06 - Média Simples
// Crie um programa que leia duas notas, calcule a média e exiba o resultado.

package com.raissasf.semana01fundamentos.basico;

import java.util.Scanner;

public class MediaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = scanner.nextDouble(); 

        System.out.print("Digite a segunda nota: ");
        double nota02 = scanner.nextDouble(); 

        double media = (nota01 + nota02) / 2;

        System.out.println("A média da nota " + nota01 + " com a nota " + nota02 + " é igual a " + media); 

        scanner.close(); 
    }
}