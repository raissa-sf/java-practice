// Exercicio 05 - Entrada do Usuário
// Faça um programa que leia o nome do usuário e imprima: "Olá, [nome]!"

package com.raissasf.semana01fundamentos.basico;

import java.util.Scanner;

public class Exercicio05_EntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); 

        System.out.println("Olá, " + nome + "!"); 

        scanner.close(); 
    }
}
