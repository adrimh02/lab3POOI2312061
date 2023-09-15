/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica02;

/**
 *
 * @author Alumno
 */
public class Pregunta3 {
     //Ejercicio 3.1
public class Pregunta02 {
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
public class Pregunta02 {
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
}
