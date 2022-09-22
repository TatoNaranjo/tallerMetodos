/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PuntoDos;
import java.util.Scanner;
public class Alumnos {
    //Inicio del Método PromedioAlumnos
 public void promedioAlumnos(){
     //Inicializando El Scanner
 Scanner sc = new Scanner (System.in);
 //Se Pregunta El Numero de Alumnos Para Promediar, Se guarda en Una Variable llamada Cantidad
     System.out.println("¿A Cuántos alumnos desea Promediar?");
     int cantidad = sc.nextInt();
     //Se Inicializan las Variables promedio, Suma y Nota como Doubles por si se trabaja con Decimales.
     double promedio = 0;
     double suma = 0;
     double nota = 0;
     //Se crea una matriz del Tamaño del Numero de Los Estudiantes
     //Que Representa el Promedio Global de todos los Estudiantes
     double promedioGlobal[] = new double[cantidad];
     //Se Inicializa en 0 La Variable que nos mostrará el PromedioGlobal
     double promGlobal = 0;
     //Se Inicia el Ciclo Repetitivo que Se ejecutará Hasta alcanzar el Numero maximo de Estudiantes
     for (int i = 0; i < cantidad; i++) {
         //Inicializo una variable que Permita Mostrarnos el Numero de Alumno en el Que Vamos
         int numero = i+1;
         System.out.println("Cuántas notas tiene el alumno "+ numero);
         int numNotas = sc.nextInt();
         //Se Inicia El Ciclo Repetitivo que  permite Hacer El Promedio de Notas de Cada Estudiante.
         for (int j = 0; j < numNotas; j++) {
             //Inicializo una variable que Permita Mostrarnos el Numero de la Nota en la Que Vamos
             int numero2 = j+1;
             //Pedimos al Usuario que Ingrese la Nota
             System.out.println("Ingrese la Nota N°"+numero2);
            nota = sc.nextInt();
            //Se Hace un Acumulador de la Suma 
             suma = suma + nota;
             //Se Saca el promedio del Estudiante.
           promedio = suma/numNotas;
         }
          //Fin del Ciclo Repetitivo que permite Hacer El Promedio de Notas de Cada Estudiante.
          //El Promedio del Estudiante Se Almacena en el Arreglo de Promedio Global
         promedioGlobal[i] = promedio;
         //Se Imprime El Promedio del Estudiante.
         System.out.println("------------------//----------------------------------------");
           System.out.println("El Promedio del Estudiante "+numero+ " es:" + promedio);
            System.out.println("------------------//----------------------------------------");
            
            //Se Resetean la variable Nota,Suma, y Promedio para la operación del Siguiente Estudiante.
           nota = 0;
           suma = 0;
           promedio = 0;
     }
     //Fin de el Ciclo Repetitivo que Se ejecutará Hasta alcanzar el Numero maximo de Estudiantes
     //Se Crea una variable acumuladora para sumar los promedios de los Estudiantes.
     double sumGlobal = 0;
     
     //Inicio de Un Ciclo Repetitivo que se ejecuta hasta que i alcance el tamaño de la Matriz Promedio Global
     for (int i = 0; i < promedioGlobal.length; i++) {
     //Se Suman los Promedios de los Estudiantes
       sumGlobal = sumGlobal + promedioGlobal[i];
       
      
     }
     //Fin de Un Ciclo Repetitivo que se ejecuta hasta que i alcance el tamaño de la Matriz Promedio Global
    //Se Saca el Promedio Global de el Grupo de Estudiantes
        promGlobal = sumGlobal/cantidad;
        
        //Se Imprime El Promedio Total de las notas de los Estudiantes.
     System.out.println("El Promedio Total de los Estudiantes es: "+promGlobal);
 }   
}
