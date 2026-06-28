/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author Stef
 */
public abstract class Persona {
    
    protected String nombre;
    protected String identificacion;
    protected String telefono;
    protected String direccion;
    
    public String getNombre(){
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
        
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Persona (String nombre, String identificacion, String telefono, String direccion){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
}
