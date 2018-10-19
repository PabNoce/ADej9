/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos.ej9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Fichero {

    public static void leerFichero() {
        Alumno alumno;
        File fich = new File("Alumnos.txt");
        try {
            String linea;
            String[] lista = new String[3];
            Scanner sc = new Scanner(fich);
            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                lista = linea.split(",");
                alumno = new Alumno(lista[0], Integer.parseInt(lista[1]), Integer.parseInt(lista[2]));
                Alumnos.añadir(Integer.parseInt(lista[21]), alumno);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }

    public static void escribirFichero(HashMap<Integer, Alumno> alumnos) {
        File fich = new File("Alumnos.txt");
        try {

            PrintWriter escribir = new PrintWriter(fich);

            for (int key : alumnos.keySet()) {
                int id = alumnos.get(key).getCodigo();
                int edad = alumnos.get(key).getEdad();
                String nombre = alumnos.get(key).getNombre();
                escribir.println(nombre + "," + edad + "," + id);
            }

            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }
}
