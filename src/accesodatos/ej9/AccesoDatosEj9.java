/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos.ej9;

import static accesodatos.ej9.Alumnos.alumnos;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class AccesoDatosEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Fichero.leerFichero();
        boolean salir = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("-MENU-\n"
                    + "1-Dar de alta.\n"
                    + "2-Consultar alumnos\n"
                    + "3-Modificar alumno\n"
                    + "4-Borrar alumno\n"
                    + "0-Salir\n");

            int i, code, error = 0, edad;
            String nombreAlumno;
            do {
                i = Integer.parseInt(scan.nextLine());
                switch (i) {
                    case 1:
                        System.out.println("Introduce nombre");
                        nombreAlumno = scan.nextLine();
                        System.out.println("introduce edad");
                        edad = Integer.parseInt(scan.nextLine());
                        Alumnos.crear(nombreAlumno, edad);
                        break;
                    case 2:
                        Alumnos.mostrarLista();
                        break;
                    case 3:
                        System.out.println("Introduce el codigo del alumno.");
                        code = Integer.parseInt(scan.nextLine());
                        Alumnos.modificar(code);
                        break;
                    case 4:
                        System.out.println("Introduce el codigo del alumno.");
                        code = Integer.parseInt(scan.nextLine());
                        Alumnos.eliminar(code);
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        error = 1;
                        System.out.println("Introduce una opcion válida");
                        break;
                }
            } while (error == 1);
        } while (salir == false);
        Fichero.escribirFichero(alumnos);
    }

}
