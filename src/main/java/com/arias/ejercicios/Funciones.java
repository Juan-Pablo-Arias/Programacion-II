package com.arias.ejercicios;

import java.util.Scanner;

public class Funciones {

    public static void mostrarSaludo() {
        System.out.println("Hola, mundo");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }

    public static void mostrarMenu() {
        System.out.println("1. Opcion 1\n2. Opcion 2\n3. Opcion 3\n4. Salir");
    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int calcularCuadrado(int numero) {
        int resultado = numero * numero;
        return resultado;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sumarNumeros(int... numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma;
    }

    public static double promedioArray(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        double promedio = suma / numeros.length;
        return promedio;
    }

    public static boolean buscarNumero(int[] array, int numeroBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                return true;
            }
        }
        return false;
    }

    public static int contarPalabras(String[] array, String palabraBuscada) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(palabraBuscada)) {
                contador++;
            }
        }
        return contador;
    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        int posicion = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arrayInvertido[posicion] = array[i];
            posicion++;
        }
        return arrayInvertido;
    }

    public static String mejorNota(String[] nombres, double[] notas) {
        int posicionMejor = 0;
        double notaMayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
                posicionMejor = i;
            }
        }
        return nombres[posicionMejor];
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*

        Nivel 1 – Fundamentos de métodos (sin arrays)

        1. Mostrar mensaje fijo

        mostrarSaludo();

        2. Saludo personalizado

        System.out.print("Ingresa tu nombre: ");
        String miNombre = teclado.nextLine();
        saludar(miNombre);

        3. Área de un rectángulo

        System.out.println("El area del rectangulo es: " + calcularArea(5, 10));

        4. Convertir a mayúsculas

        System.out.println(aMayusculas("esto estaba en minusculas"));

        5. Mostrar menú

        mostrarMenu();

        Nivel 2 – Métodos con retorno y lógica

        6. Número par o impar

        System.out.println("¿El numero 4 es par? " + esPar(4));


        7. Calcular el cuadrado de un número

        System.out.println("El cuadrado de 5 es: " + calcularCuadrado(5));


        8. Factorial recursivo

        System.out.println("El factorial de 5 es: " + factorial(5));


        Nivel 3 – Métodos con varargs y arrays

        9. Sumar múltiples números (varargs)

        System.out.println("La suma es: " + sumarNumeros(10, 20, 30));


        10. Promedio de un array

        double[] misNotas = {7.5, 8.0, 9.5};
        System.out.println("El promedio es: " + promedioArray(misNotas));


        11. Buscar valor en array

        int[] numerosParaBuscar = {1, 5, 10, 15};
        System.out.println("¿Esta el numero 10? " + buscarNumero(numerosParaBuscar, 10));


        12. Contar ocurrencias

        String[] misPalabras = {"java", "sql", "java", "html"};
        System.out.println("Veces que aparece 'java': " + contarPalabras(misPalabras, "java"));


        Nivel 4 – Métodos combinados y más complejos

        13. Imprimir array de forma formateada

        int[] arrayImprimir = {100, 200, 300};
        imprimirArray(arrayImprimir);

        14. Invertir array

        int[] arrayNormal = {1, 2, 3, 4, 5};
        int[] elInvertido = invertirArray(arrayNormal);
        imprimirArray(elInvertido);

        15. Estudiante con mejor nota

        String[] alumnos = {"Ana", "Nico", "Juan Pablo"};
        double[] notasAlumnos = {8.0, 7.5, 10.0};
        System.out.println("El mejor es: " + mejorNota(alumnos, notasAlumnos));

        teclado.close();

        */
    }
}