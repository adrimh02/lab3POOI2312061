/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica02;

/**
 *
 * @author Alumno
 */
public class Practica02 {

    public static void main(String[] args) {
       import java.util.Scanner;

public class Practica02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un número: ");
            int N = sc.nextInt();
            
            if (N >= 2 && N <= 20) {
                for (int i = 1; i <= 10; i++) {
                    int resultado = N * i;
                    System.out.println(N + " x " + i + " = " + resultado);
                }
            } else {
                System.out.println("El número ingresado no está dentro del rango válido (2 <= N <= 20).");
            }
        }
    }
}
    }

