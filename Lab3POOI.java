/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3pooi;

/**
 *
 * @author Alumno
 */
public class Lab3POOI {

    public static void main(String[] args) {
        //Ejercicio 1
import java.util.Scanner;

public class Lab3POOI {
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
       //Ejercicio 2
import java.util.Scanner;

public class Lab3POOI {
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
        //Ejercicio 3
    //Ejercicio 3.1
public class Lab3POOI {
public static void main(String[] args) {
    /* Se declara la variable i, cuyo valor inicial es cero, 
       y la variable x*/
        int i=0;
        int x;
    /* La variable x toma los valores de i 
       reemplazados en la operación propuesta*/
       do{
        x = 2*i-10;
    /* En caso de que el valor de x sea negativo,
       se convierte en su opuesto positivo*/
        if (x<0){
            x = -x;
        }
    /* Se imprime el valor de i al lado del nuevo valor de x*/
        System.out.println(i + " " + x);
    /* Se repetirá la operación para cada valor de i menor que 10*/    
        i++;
       } while (i<10);

    }
    //Ejercicio 3.2
public class Lab3POOI {
public static void main(String[] args) {
        /* La variable count toma como primer valor al número 1*/
        int count = 1;
        /* Se inserta como operación requerida la raíz cuadrada 
        al lado del valor natural de la variable*/
        do {
            System.out.println(count + " " + Math.sqrt(count));
        /* Se toma en cuenta todos los valores menores a 10 
            y se repite la operación para cada uno*/
            count++;
        }while (count < 10);
    }
    
   

