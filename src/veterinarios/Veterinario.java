/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinarios;
import personas.Persona;

/**
 *
 * @author Stef
 */
public class Veterinario extends Persona {
    
    private String especialidad;
    private int anosExperiencia;
    
    public String getEspecialidad(){
        return this.especialidad;
    }
    public int getAnosExperiencia(){
        return this.anosExperiencia;
    }
    public void setAnosExperincia( int anosExperincia){
        this.anosExperiencia = anosExperincia;
    }
    public Veterinario (String nombre, String identificacion, String telefono, String direccion, String especialidad, int anosExperincia){
        super(nombre,identificacion, telefono,direccion);
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperincia;
    }
    @Override
    public String toString() {
        return "Veterinario{" + "Nombre: " + getNombre() + "Identificacion: " + getIdentificacion() + 
                "Telefono: " + getTelefono() + "Direccion: " + getDireccion() +
                "especialidad=" + especialidad + ", anosExperiencia=" + anosExperiencia + '}';
    }   
    
}
