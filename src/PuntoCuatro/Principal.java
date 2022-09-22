
package PuntoCuatro;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        //Se inicializa el Constructor de la Clase Métodos
        Metodos met = new Metodos();
        //Inicializando el Objeto Scanner para Recibir Parámetros.
        Scanner sc = new Scanner(System.in);
        
        //Imprime Las 3 Opciones del Usuario Para Poder Operar en el Programa
        System.out.println("Hola Usuario. Por Favor Elige una Opción:1,2,3.");
        System.out.println("1.Saber si tu Numero es Impar o No");
        System.out.println("2.Obtener el Factorial de Tu Numero");
        System.out.println("3.Decir Cuantos Dígitos Tiene tu Numero");
        
        //El Usuario Digita Un Número y se Guarda en la Variable Desición
        int desicion = sc.nextInt();
        
        switch (desicion){
            //Si el Usuario Digita 1, Se Ejecuta el Metodo Par de la Clase Metodos
            case 1:{ 
                met.par(); 
                break;
            }
            //Si el Usuario Digita 2, Se Ejecuta el Metodo Factorial de la Clase Metodos
            case 2: {
                met.factorial(); 
                break;
            }
            //Si El Usuario Digita 3, Se Ejecuta el Método Digitos de la Clase Métodos.
            case 3: {
                met.digitos(); 
                break;
            }
            
    
    
    }

    }
}
