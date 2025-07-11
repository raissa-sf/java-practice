// Exercicio 07 - Área do Retângulo
// Crie um programa que calcule a área de um retângulo a partir da base e altura fornecidas pelo usuário.

package com.raissasf.semana01fundamentos.basico;

import java.util.Scanner;

public class Exercicio07_AreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do retângulo em m²: ");
        double base = scanner.nextDouble(); 

        System.out.print("Digite o valor da altura do retângulo em m²: ");
        double altura = scanner.nextDouble(); 

        double area = base * altura;

        System.out.println("A área do retângulo é igual a " + area + " m²."); 

        scanner.close(); 

    }
}