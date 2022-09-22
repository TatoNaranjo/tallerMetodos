
package PuntoUno;

import java.util.Scanner;

public class Metodos {
    //Declarar El Numero de Depósitos y el Numero de Retiros para el Usuario
        int numeroDepositos = 0;
      int numeroRetiros = 0;
  //Declarar el total de Dinero que tiene el usuario, e inicializarlo en 0.
    int deposito = 0;
    //Inicialización del Scanner
    Scanner sc = new Scanner(System.in);
    //Inicio del Metodo en el que Opera el Cliente
  public void operaCliente(){
      //Solicitamos el Nombre al Usuario y lo guardamos en la variable Nombre
      System.out.println("Ingrese su Nuevo Nombre de Usuario.");
     String nombre = sc.nextLine();
     //Solicitamos el Numero de Identificación y lo guardamos en un ID
      System.out.println("Ingrese su Nuevo Numero de Identificación");
     int id = sc.nextInt();
     //Le informamos al Usuario que su depósito comienza con 0 pesos.
       System.out.println("Actualmente su Cuenta se encuentra con: "+deposito+" pesos");
     System.out.println("Bienvenido al Sistema "+ nombre + " qué desea hacer?");
      movimientos(nombre,id);
  }
  //Fin del Metodo en el que Opera el Cliente
  
  //Inicio del Metodo que Realiza Los Movimientos en el Sistema
  //Este método recibe el nombre y el ID del Usuario para la factura Final.
  public void movimientos(String nombre,int id){
   //Menú de Operación Del Usuario
      System.out.println("------------//-----------");
      System.out.println("Escriba el Numero de la Opción a Elegir");
      System.out.println("1.Depositar dinero");
      System.out.println("2.Retirar Dinero");
      System.out.println("3.Generar Factura de Movimientos");
      System.out.println("------------//-----------");
      int desicion = sc.nextInt();
      //Si el Usuario elige Depositar dinero, el numero de Depositos aumenta, si el Usuario elige Retirar Dinero
      //El numero de Retiros aumenta.
      if (desicion == 1) numeroDepositos++;
      if (desicion == 2) numeroRetiros++;
      
      switch(desicion){
          //Si el usuario elige depositar, se procede a solicitar la cantidad de dinero a depositar y se repite el 
          //Método Movimientos
          case 1:{
              System.out.println("¿Cuánto dinero desea depositar?");
              int dinero = sc.nextInt();
              System.out.println("Actualmente el depósito de su Cuenta se encuentra en: "+deposito+" pesos");
              deposito = deposito + dinero;
            
           movimientos(nombre,id);
          break;
          }
          //Si el usuario elige retirar, se procede a solicitar la cantidad de dinero a retirar y se repite el 
          //Método Movimientos
          case 2:{
              System.out.println("¿Cuánto Dinero desea Retirar?");
              int dinero = sc.nextInt();
              //Si no tiene dinero suficiente para retirar, se imprime este mensaje y se repite el metodo Movimientos
              if(deposito<dinero)System.out.println("Lo Sentimos,No tienes Dinero Suficiente para hacer el Retiro");
              //Si tiene dinero suficiente, se procede a restar el Dinero del Depósito.
              else{
              deposito = deposito-dinero;
              System.out.println("Actualmente el depósito de su Cuenta se encuentra en: "+deposito+" pesos");
             
              }
              //Se repite el Método Movimientos.
            movimientos(nombre,id);
          break;
          }
          case 3:{
              //Se Procede a Imprimir el Recibo de Pago.
              System.out.println("----------//----------");
              System.out.println("RECIBO DE Movimientos:");
              System.out.println("----------//----------");
              System.out.println("Nombre de Usuario: "+ nombre);
              System.out.println("Numero de Identificacion: "+id);
              System.out.println("Saldo de la Cuenta: "+deposito);
              System.out.println("Movimientos de Depósito: "+numeroDepositos);
              System.out.println("Movimientos de Retiro: " + numeroRetiros);
              System.out.println("----------//----------");
          break;
          }
      
      }
  }
  //Fin del Método Movimientos.
  
}
