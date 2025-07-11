// Exercicio 02 - Informações Pessoais
// Crie um programa que declare variáveis para nome, idade e cidade e exiba essas informações no console.

package com.raissasf.semana01fundamentos.basico;

public class Exercicio02_InfoPessoal {
    
    public static void main(String[] args) {
        
        String nome = "Raissa";
        int idade = 19;
        String cidade = "Bragança Paulista";
        
        System.out.println("=== INFORMAÇÕES PESSOAIS ===");
        System.out.println("\nSeu nome é " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você mora em " +  cidade);
    }
}
