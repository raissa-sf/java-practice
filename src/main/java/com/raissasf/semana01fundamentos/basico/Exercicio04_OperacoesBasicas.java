// Exercicio 04 - Operações Básicas
// Crie um programa que declare dois números e mostre a soma, subtração, multiplicação e divisão entre eles.

package com.raissasf.semana01fundamentos.basico;

public class Exercicio04_OperacoesBasicas {

    public static void main(String[] args) {

        double numero01 = 200.50;
        double numero02 = 100.50;

        double soma = numero01 + numero02;
        double subtracao = numero01 - numero02;
        double multiplicacao = numero01 * numero02;
        double divisao = numero01 / numero02;

        System.out.println("=== OPERAÇÕES BÁSICAS ===");
        System.out.println("\nA soma entre " + numero01 + " + " + numero02 + " é igual a " + soma);
        System.out.println("A subtração entre " + numero01 + " + " + numero02 + " é igual a " + subtracao);
        System.out.println("A multplicação entre " + numero01 + " + " + numero02 + " é igual a " + multiplicacao);
        System.out.println("A divisão entre " + numero01 + " + " + numero02 + " é igual a " + divisao);

    }
}