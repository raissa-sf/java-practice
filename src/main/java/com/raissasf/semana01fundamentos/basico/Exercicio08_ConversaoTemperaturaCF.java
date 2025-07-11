// Exercicio 08 - Conversão de Temperatura
// Crie um programa que converta uma temperatura de Celsius para Fahrenheit.
// Fórmula: F = (C × 9/5) + 32

package com.raissasf.semana01fundamentos.basico;

import java.util.Scanner;

public class Exercicio08_ConversaoTemperaturaCF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em °C: ");
        double temperaturaCelsius = scanner.nextDouble(); 

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A área do retângulo é igual a " + area + " m²."); 

        scanner.close(); 

    }
}