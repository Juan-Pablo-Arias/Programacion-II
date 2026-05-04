package com.arias.programacionii_proyecto1;
import java.util.Scanner;

public class ActividadesRepaso {
    public static void main(String[] args) {

        /*
        Repaso bucles, for , while y do while

        Ejercicios con for

        1. Contar hasta 10: Imprime los números del 1 al 10.

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        2. Números Pares: Imprime todos los números pares del 0 al 20.

        for (int i = 0; i <= 20; i++){
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }

        for(int i = 0; i<= 20; i += 2) {
            System.out.println(i);
        }

        3. Suma de Números: Calcula la suma de los números del 1 al 100 e imprímela.

        int suma = 0;
        for (int i = 1; i <= 100; i++){
            suma += i;
        }
        System.out.print("La suma del 1 al 100 es: " + suma );

        Ejercicios con while

        4. Cuenta Regresiva: Imprime una cuenta regresiva desde 5 hasta 1, y luego "¡Despegue!".

        int cuentaRegresiva = 5;
        while (cuentaRegresiva >= 1){
            System.out.println(cuentaRegresiva);
            cuentaRegresiva--;
        }
        System.out.println("Despegue");

        5. Adivina el Número (Simple): Simula un juego donde tienes que adivinar un número fijo. El bucle continúa hasta que el número sea adivinado.

        Scanner teclado = new Scanner(System.in);
        System.out.println("¡Bienvenidos al juego de adivinar el numero secreto!");
        int numeroSecreto = 17;
        int intento = 0;
        System.out.println("Ingrese un numero al azar del 0 al 20: ");

        while (intento != numeroSecreto){

            intento = teclado.nextInt();

            if (intento != numeroSecreto){
                System.out.println("Numero incorrecto, por favor intente nuevamente: ");
            }
        }
        System.out.println("¡FELICITACIONES EL NUMERO INGRESADO ES EL CORRECTO!");

        6. Validación de Entrada (Básica): Pide al usuario que ingrese una contraseña (simulada) hasta que sea correcta.

        Scanner teclado = new Scanner(System.in);
        int contraseña = 124345;
        int intento = 0;
        System.out.println("Ingrese su contraseña: ");
        while (intento != contraseña){

            intento = teclado.nextInt();

            if (intento != contraseña){
                System.out.println("Contraseña incorrecta, por favor intente nuevamente: ");
            }
        }
        System.out.println("¡BIENVENIDO AL SISTEMA!");

        Scanner teclado = new Scanner(System.in);
        String contraseña = "Juan171003";
        String intento = "";
        System.out.println("Ingrese su contraseña: ");

        while (!intento.equals(contraseña)){
            intento = teclado.nextLine();

            if (!intento.equals(contraseña)){
                System.out.println("Contraseña incorrecta, por favor intente nuevamente: ");
            }
        }
        System.out.println("¡BIENVENIDO AL SISTEMA!");

        Ejercicios con do-while

        7. Menú Simple (Una Vez Garantizada): Imprime un menú de opciones al menos una vez, y luego pregunta si el usuario quiere verlo de nuevo. El bucle continúa si el usuario lo desea.

     Scanner teclado = new Scanner(System.in);
     int opcionUsuario = 0;

     do {
         System.out.println("\n----Menu de opciones----");
         System.out.println("1) Consultar Saldo");
         System.out.println("2) Imprimir ticket");
         System.out.println("3) Otras operaciones");
         System.out.println("0) Salir del menu");
         System.out.println("Elija una opcion: ");

         opcionUsuario = teclado.nextInt();

     } while (opcionUsuario != 0);

     System.out.println("SALIENDO DEL SISTEMA...");

     8. Solicitar Número Positivo: Pide al usuario que ingrese un número, y sigue pidiéndolo hasta que ingrese un número positivo.

        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Ingrese un numero por favor: ");
            numero = teclado.nextInt();

        } while (numero <= 0);

        9. Contador Mínimo: Imprime números del 1 al 3. Asegura que al menos el 1 se imprima, incluso si la condición del while se cumple desde el principio.

        int contadorMinimo = 1;
        do {
            System.out.println("Contador = " + contadorMinimo);
            contadorMinimo ++;
        } while (contadorMinimo <=3);

        Ejercicio Mixto

        10. Tablas de Multiplicar (del 1 al 5): Usa un bucle externo (for) para iterar por las tablas del 1 al 5, y un bucle interno (for, while o do-while) para calcular e imprimir cada multiplicación (del 1 al 10).

        for (int tabla = 1; tabla <= 5 ; tabla++){
            System.out.println("--- Esta es la tabla del " + tabla + " ---");

            for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
                int resultado = tabla * multiplicador;
                System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            }
            System.out.println();

         */
        }
    }
}
