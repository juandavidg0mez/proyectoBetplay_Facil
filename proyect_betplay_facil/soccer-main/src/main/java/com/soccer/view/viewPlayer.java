package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Player;

public class viewPlayer {
       public static Controller jugadores = new Controller();
       public static Controller controladorEquipos = new Controller();

       public void start() {

              Scanner scanner = new Scanner(System.in);

              while (true) {
                     System.out.println("1. Añadir un player");
                     System.out.println("2. Actualizar player");
                     System.out.println("3. Buscar player");
                     System.out.println("4. Eliminar player");
                     System.out.println("5. Listar todos player");
                     System.out.println("6. Salir");
                     int choice = scanner.nextInt();
                     scanner.nextLine();
                     switch (choice) {
                            case 1:
                                   System.out.println(
                                                 "---------------------------------[CREAR EQUIPOS]--------------------------------- ");
                                   Player player = new Player();
                                   System.out.println("Ingrese nuevo DNI del jugador:");
                                   String codigoPlayer = scanner.nextLine();
                                   System.out.println("Ingrese Nombre del jugador:");
                                   player.setNombre(scanner.nextLine());
                                   System.out.println("Ingrese Apellido del jugador:");
                                   player.setApellido(scanner.nextLine());
                                   System.out.println("Ingrese dorsal:");
                                   player.setDorsal(scanner.nextInt());
                                   scanner.nextLine(); // consume the newline
                                   System.out.println("Ingrese Posición del jugador:");
                                   player.setPosicion(scanner.nextLine());
                                   jugadores.listajugadores.put(codigoPlayer, player);
                                   System.out.println("Jugador registrado exitosamente");
                                   break;
                            case 2:
                                   System.out.println("monda");
                                   break;
                            case 3:
                                   break;
                            case 4:
                                   break;
                            case 5:
                                   break;
                     }
              }
       }

      
}