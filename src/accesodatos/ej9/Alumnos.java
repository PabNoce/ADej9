/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos.ej9;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Alumnos {

    static HashMap<Integer, Alumno> alumnos = new HashMap();
    static Alumno alumno;

    public static void crear(String nombreAlumno, int edad) {
        int newID = 1;
        boolean creado = false;
        do {
            if (alumnos.containsKey(newID)) {
                newID++;

            } else {

                alumno = new Alumno(nombreAlumno, edad, newID);
                alumnos.put(newID, alumno);
                creado = true;
            }
        } while (creado == false);
    }

    public static void mostrarLista() {
        for (int key : alumnos.keySet()) {
            System.out.println(alumnos.get(key).toString());
        }

    }
     public static void añadir(int idAlumno, Alumno alumno) {
        alumnos.put(idAlumno, alumno);
    }

    public static void eliminar(int idAlumno) {
        if (alumnos.containsKey(idAlumno)) {
            alumnos.remove(idAlumno);
            System.out.println("Alumno eliminado");
        }
    }

    public static void modificar(int idAlumno) {

        if (alumnos.get(idAlumno) != null) {
            System.out.println("Que deseas modificar?\n1-Nombre\n2-Edad\n3-Codigo\n");
            Scanner scan = new Scanner(System.in);
            int i = Integer.parseInt(scan.nextLine());
            switch (i) {
                case 1:
                    System.out.println("Introduce nuevo nombre");
                   alumnos.get(idAlumno).setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.println("Introduce nueva edad");
                    alumnos.get(idAlumno).setEdad(Integer.parseInt(scan.nextLine()));
                    break;
                case 3:
                    System.out.println("Introduce nuevo código");
                    alumnos.get(idAlumno).setCodigo(Integer.parseInt(scan.nextLine()));
                    break;
                default:
                    break;
            }

        }
    }
}
