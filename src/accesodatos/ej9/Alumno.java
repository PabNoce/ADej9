/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos.ej9;

/**
 *
 * @author pablo
 */
public class Alumno {
    private String nombre;
    private int edad, codigo;

    public Alumno(String nombre, int edad, int codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", codigo=" + codigo;
    }
    
}
