package PuntoCuatro;

import java.util.Scanner;

public class Metodos {
  //Inicializando el Objeto Scanner para Recibir Parámetros.
    Scanner sc = new Scanner(System.in);

    //Inicio del Metodo que Detecta Pares e Impares
    public void par() {
        //Se Digita el Numero
        System.out.println("Escribe el Numero Por Favor");
        //Se guarda en una variable X
        int x = sc.nextInt();
        //Si el modulo de X/2 es Igual A Cero, Imprime: El Numero es Par
        if (x % 2 == 0) {
            System.out.println("El Numero es Par");
            //Si el Modulo de X/2 es Diferente de Cero Imprime: El Numero es Impar   
        } else {
            System.out.println("El Numero es Impar");
        }

    }
    //Fin del Metodo que Detecta Pares e Imares

    //Inicio del Metodo que Cuenta Dígitos
    public void digitos() {
        //Se Pide el Numero
        System.out.println("Escribe el Numero Por Favor");

        //Se Guarda en Una Variable num
        int num = sc.nextInt();
        //Se inicializa en 1 una variable Contador: i 
        int i = 1;
        //Se hace un ciclo for, mientras que el Numero sea mayor a 0, se dividirá en 10
        //Por cada división, el Contador Aumenta.
        for (int j = 0; j < num; j++) {
            num = num / 10;
            i++;
        }
        //Al final se imprime el numero total que quedó en el Contador
        System.out.println("El Numero tiene " + i + " digitos");
    }
//Fin del Metodo que Cuenta dígitos

    //Inicio del Metodo que Detecta El Factorial de Un Número
    public void factorial() {
        //Se solicita un Numero
        System.out.println("Por Favor Ingresa el Numero:");
        //Se guarda en una variable llamada Numero
        int numero = sc.nextInt();

        //Se inicia la variable Factorial en 1.
        int fact = 1;
        //Desde una variable i hasta el numero solicitado, se multiplica el Factorial por i
        //y se sobreescribe en cada ciclo
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        //Se imprime el Resultado de el ciclo: El Factorial del Numero
        System.out.println("El Factorial de Tu Numero es:" + fact);
        
        //Fin del Metodo que Detecta El Factorial de Un Numero.
    }

}
