package com.mycompany.tallerrpgstefanny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        // Personaje enemigo/base
        Personaje p1 = new Personaje();

        // Personaje que será creado por el usuario
        Personaje p2 = null;

        do {

            System.out.println("\n===== RPG =====");
            System.out.println("1. Crear personaje");
            System.out.println("2. Mostrar personajes");
            System.out.println("3. Atacar");
            System.out.println("4. Ataque crítico");
            System.out.println("5. Curar");
            System.out.println("6. Subir nivel");
            System.out.println("7. Mostrar estado");
            System.out.println("8. Pelea automática");
            System.out.println("9. Salir");

            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el nombre del personaje: ");
                    String nombre = scanner.next();

                    System.out.print("Ingresa los puntos de vida máximos: ");
                    double puntosVidaMax = scanner.nextDouble();

                    System.out.print("Ingresa los puntos de ataque: ");
                    double puntosAtaque = scanner.nextDouble();

                    System.out.print("Ingresa los puntos de defensa: ");
                    double puntosDefensa = scanner.nextDouble();

                    p2 = new Personaje(
                            nombre,
                            puntosVidaMax,
                            puntosAtaque,
                            puntosDefensa
                    );

                    System.out.println("Personaje creado correctamente.");
                    p2.mostrarEstado();
                    break;

                case 2:
                    System.out.println("\n--- Personaje 1 ---");
                    p1.mostrarEstado();

                    if (p2 != null) {
                        System.out.println("\n--- Personaje del usuario ---");
                        p2.mostrarEstado();
                    } else {
                        System.out.println("\nTodavía no has creado tu personaje.");
                    }
                    break;

                case 3:
                    if (p2 != null) {
                        p2.atacar(p1);
                    } else {
                        System.out.println("Primero debes crear tu personaje.");
                    }
                    break;

                case 4:
                    if (p2 != null) {
                        Batalla.ejecutarAtaqueCritico(p2, p1);
                    } else {
                        System.out.println("Primero debes crear tu personaje.");
                    }
                    break;

                case 5:
                    if (p2 != null) {
                        p2.curar();
                        System.out.println(p2.nombre + " se ha curado.");
                    } else {
                        System.out.println("Primero debes crear tu personaje.");
                    }
                    break;

                case 6:
                    if (p2 != null) {
                        p2.subirNivel();
                        System.out.println(
                                p2.nombre + " subió al nivel " + p2.nivel
                        );
                    } else {
                        System.out.println("Primero debes crear tu personaje.");
                    }
                    break;

                case 7:
                    System.out.println("\n--- Estado del enemigo ---");
                    p1.mostrarEstado();

                    if (p2 != null) {
                        System.out.println("\n--- Estado de tu personaje ---");
                        p2.mostrarEstado();
                    } else {
                        System.out.println("\nTodavía no has creado tu personaje.");
                    }
                    break;

                case 8:
                    if (p2 != null) {
                        Batalla.iniciarPeleaAutomatica(p2, p1);
                    } else {
                        System.out.println("Primero debes crear tu personaje.");
                    }
                    break;

                case 9:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 9);

        scanner.close();
    }
}

//    p1.atacar(p2);
//    p1.atacar(p2);
//    p2.curar();
//    p1.subirNivel();
//    p1.mostrarEstado();
//    Batalla.ejecutarAtaqueCritico(p1, p2);
//    Batalla.iniciarPeleaAutomatica(p1, p2);
//    p1.mostrarEstado();
//    p2.mostrarEstado();
//    
//    System.out.println(p2.puntosVida);
//
//    
//    System.out.println(p1.nombre);
//    
//    p1.nombre = "Kirby";
//    
//    System.out.println(p1.nombre);
//    System.out.println(p2.nombre);
//    System.out.println(p2.puntosVida);
//    System.out.println(Personaje.totalPersonajesCreados);
//    System.out.println(p2.estaVivo());
//    System.out.println(p1.nivel);
//    System.out.println(p2.puntosVida);

