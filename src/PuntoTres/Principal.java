package PuntoTres;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Metodos met = new Metodos();
        Scanner sc = new Scanner(System.in);
        
        //Se Solicita al usuario que Ingrese un Numero según la Opción Requerida
        System.out.println("Por Favor Selecciona Una Opción"); 
        
        System.out.println("1.Promedio de Un Conjunto de Numeros");
        System.out.println("2.Suma de Un Conjunto de Numeros");
        //Se guarda todo en Una Variable llamada Desicion.
        int desicion = sc.nextInt();
        switch(desicion){
            //Si selecciona 1, se ejecuta el Metodo promedio de la Clase Metodos
            case 1: {
            met.Promedio();
            break;
            }
            //Si Selecciona 2, se ejecuta el metodo Suma de la Clase Metodos.
            case 2: {
            met.Suma();
            break;
            }
        
        }
 
    }

}
