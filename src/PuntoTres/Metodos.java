/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PuntoTres;

import java.util.Scanner;

public class Metodos {
    //Inicio Metodo Suma del Conjunto de Numeros
  public void Suma(){
      //Se Solicita un numero seguido de un ENTER, si el Usuario Digita -1, El Programa empieza a calcular.
      System.out.println("Por favor, digita un número y presiona ENTER. Si digitas -1, se procederá a hacer el cálculo.");
     Scanner sc = new Scanner(System.in);
     //Se inicializan unas Variables x,i y Suma. x para guardar el numero que pongamos, i para contar cuantos numeros has digitado
     //y suma para hacer la suma del conjunto de Numeros
        int x = 0;
        int i = 0;
        int suma = 0;
        //Mientras que X sea diferente a -1, seguimos solicitando Numeros al usuario.
        while(x !=-1){
        x = sc.nextInt();
        //Aumentamos el Contador por cada ciclo.
        i++;
        //Si x es diferente a -1 se suma al acumulador final
        if(x!=-1)
        suma = suma + x;
        }
      //Al contador se le resta 1 ya que es el numero final que pusimos, por lo que no cuenta.
        i = i-1;
        //Se imprimen los resultados Por Consola.
        System.out.println("Escribiste " + i +" numeros");
        System.out.println("La suma es " + suma);
  
  }  
  //Fin Metodo Suma del Conjunto de Numeros
  
  //Inicio del Metodo que Promedia el Conjunto de Numeros
  public void Promedio(){
    //Se solicita un Numero a el Usuario
      System.out.println("Por favor, digita un número y presiona ENTER. Si digitas -1, se procederá a hacer el cálculo.");
    Scanner sc = new Scanner(System.in);
    //Inicializamos 3 variables, x para guardar el numero, i para contar cuantos numeros van, suma como acumulador.
        double x = 0;
        int i = 0;
        double suma = 0;
        //Mientras que x sea diferente de -1, el acumulador aumenta y se sigue pidiendo numero al usuario
        while(x !=-1){
        x = sc.nextInt();
        i++;
        //si x es diferente de -1 se añade al acumulador suma
        if(x!=-1)
        suma = suma + x;
        }
          //Al contador se le resta 1 ya que es el numero final que pusimos, por lo que no cuenta.
        i = i-1;
        //se crea una variable promedio en la que sacamos el promedio.
         double promedio = suma/i;
         //Imprimimos los Resultados en Pantalla
        System.out.println("Escribiste " + i +" numeros");
        System.out.println("El Promedio es " + promedio);
  
  }
  //Fin del Metodo para Promediar Numeros
}
