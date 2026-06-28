/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propietarios;
import personas. Persona;
/**
 *
 * @author María J
 */
public class Propietario extends Persona {

    public Propietario(String nombre, String identificacion, String telefono, String direccion) {
        super(nombre, identificacion, telefono, direccion);
    }

    @Override
    public String toString() {
     return "Propietario{" + "Nombre: " + getNombre() + "Identificacion: " + getIdentificacion() +
        "Telefono: " + getTelefono() + "Direccion: " + getDireccion() + '}';
    }
}


