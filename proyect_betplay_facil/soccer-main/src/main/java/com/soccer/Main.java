package com.soccer;

import java.util.Scanner;

import com.soccer.view.viewPlayer;
import com.soccer.view.viewTeam;

public class Main {
    public static Controller controlador;

    

    public static void main(String[] args) {

        Controller ctrlTeams = new Controller();
        viewTeam.controlador = ctrlTeams;
        viewTeam vt = new viewTeam();

        Controller ctrlplayer = new Controller();
        viewPlayer.jugadores = ctrlplayer;
        viewPlayer.controladorEquipos = ctrlTeams;
        viewPlayer vp = new viewPlayer();


        

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Visitar Equipos");
            System.out.println("2. Visitar Jugadores");
            System.out.println("3. Visitar Doctores");
            System.out.println("4. Visitar Coach");
            System.out.println("5. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                   
                    vt.start();
                    break;
                case 2:
                  
                    vp.start();
                    break;

                    case 3 :
                    break;
                    case 4 :
                    break;
                    case 5 :
                    scanner.close();
                    System.exit(choice);
                    System.out.println("Hasta Luego Socio");
                    break;
                
            }
        }

        // System.out.println("Jugador"+ eq.getLstJugadores().get(0).getNombre());
    }
}