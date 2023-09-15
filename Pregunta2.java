/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica02;

/**
 *
 * @author Alumno
 */
public class Pregunta2 {
    import java.util.Scanner;

public class Pregunta02 {
    public static void main(String[] args) {
        int suma;
        int contador;
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            suma = 0;
            contador = 0;
            System.out.println("Ingresa un número (Si no, ingresa -1 para terminar): ");
            numero = scanner.nextInt();
            while (numero != -1) {
                if (numero > 0) {
                    suma += numero;
                    contador++;
                } else {
                    System.out.println("Ingresa un número positivo válido.");
                }
                
                System.out.println("Ingresa un número (Si no, ingresa -1 para terminar): ");
                numero = scanner.nextInt();
            }
        }
        
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("La suma total de los " + contador + " números ingresados es " + suma);
            System.out.printf("El promedio de los %d números ingresados es %.2f\n", contador, promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}
    }

