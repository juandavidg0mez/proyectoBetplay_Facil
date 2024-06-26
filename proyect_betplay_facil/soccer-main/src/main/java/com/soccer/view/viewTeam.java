package com.soccer.view;

import java.text.MessageFormat;
import java.util.Map;
import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Team;

public class viewTeam {
    public static Controller controlador;

    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar todos Equipos");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println(
                            "---------------------------------[CREAR EQUIPOS]--------------------------------- ");
                    Team equipo = new Team();
                    String codigoEquipo = null;
                    System.out.println("Ingrese el codigo del equipo :");
                    codigoEquipo = scanner.nextLine();
                    System.out.println("Ingrese Nombre del equipo :");
                    equipo.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la ciudad :");
                    equipo.setCiudad(scanner.nextLine());
                    controlador.equipos.put(codigoEquipo, equipo);
                    break;

                case 2:
                    System.out.println(
                            "---------------------------------[ACTUALIZAR EQUIPOS]--------------------------------- ");

                    System.out.println("1. Actualizar Nombre");
                    System.out.println("2. Actualizar Ciudad");
                    System.out.println("3. Salir");
                    int op = scanner.nextInt();
                    scanner.nextLine();
                    switch (op) {
                        case 1:
                            System.out.println("ingrese el Codigo del equipo para Actualizar el Nombre");
                            codigoEquipo = scanner.nextLine();
                            if (controlador.equipos.containsKey(codigoEquipo)) {
                                equipo = controlador.equipos.get(codigoEquipo);
                                System.out.println("Ingrese el nuevo nombre del equipo:");
                                equipo.setNombre(scanner.nextLine());
                                controlador.equipos.put(codigoEquipo, equipo);
                                System.out.println("Equipo actualizado correctamente: " + equipo.getNombre());
                            } else {
                                System.out.println(
                                        "El equipo con el código " + codigoEquipo + " no existe por el momento.");
                            }
                            break;
                        case 2:
                            System.out.println("ingrese el Codigo del equipo para Actualizar el Ciudad");
                            codigoEquipo = scanner.nextLine();
                            if (controlador.equipos.containsKey(codigoEquipo)) {
                                equipo = controlador.equipos.get(codigoEquipo);
                                System.out.println("Ingrese La nueva ciudad del equipo:");
                                equipo.setCiudad(scanner.nextLine());
                                controlador.equipos.put(codigoEquipo, equipo);
                                System.out.println("Equipo actualizado correctamente: " + equipo.getNombre());
                            } else {
                                System.out.println(
                                        "El equipo con el código " + codigoEquipo + " no existe por el momento.");
                            }
                        case 3:
                            // Salir del switch interno sin hacer nada adicional
                            System.out.println("Saliendo del programa.");
                            break;

                        default:
                            System.out.println("Opción inválida, intente de nuevo.");
                            break;
                    }

                    break;

                case 3:
                    System.out.println(
                            "---------------------------------[BUSCAR EQUIPO POR CÓDIGO]--------------------------------- ");
                    System.out.println("Ingrese el código del equipo:");
                    codigoEquipo = scanner.nextLine();
                    if (controlador.equipos.containsKey(codigoEquipo)) {
                        equipo = controlador.equipos.get(codigoEquipo);
                        System.out.println("Equipo encontrado:");
                        System.out.println("Código: " + codigoEquipo);
                        System.out.println("Nombre: " + equipo.getNombre());
                        System.out.println("Ciudad: " + equipo.getCiudad());
                    } else {
                        System.out.println("El equipo con el código " + codigoEquipo + " no existe.");
                    }
                    break;
                case 4:
                    System.out.println(
                            "---------------------------------[BUSCAR EQUIPO POR CÓDIGO]--------------------------------- ");
                    System.out.println("Ingrese el código del equipo:");
                    codigoEquipo = scanner.nextLine();
                    if (controlador.equipos.containsKey(codigoEquipo)) {
                        equipo = controlador.equipos.remove(codigoEquipo);
                        System.out.println("Equipo con codigigo: " + codigoEquipo + "fue eliminado exitosamente");

                    } else {
                        System.out.println("El equipo con el código " + codigoEquipo + " no existe.");
                    }
                    break;

                case 5:
                    if (controlador.equipos.isEmpty()) {
                        System.out.println("no has registrano ningun equipo");
                        System.out.println("============");
                    } else {
                        System.out.println(
                                "---------------------------------[EQUIPOS]--------------------------------- ");
                        int i = 0;
                        for (Map.Entry<String, Team> entry : controlador.equipos.entrySet()) {
                            String codEquipo5 = entry.getKey();
                            Team eq = entry.getValue();
                            System.out.println(
                                    MessageFormat.format("| Equipo {0} | Codigo: {1} | Nombre: {2} | Ciudad: {3} |", i,
                                            codEquipo5, eq.getNombre(), eq.getCiudad()));
                            i++;
                        }

                    }

                    break;

                case 6:
                    //scanner.close();
                    //System.exit(choice);
                    System.out.println("Hasta Luego Socio");
                    return;

                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }

        }
    }
}
