/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;
import java.time.Period;
import java.time.LocalDate;
import propietarios.Propietario;

/**
 *
 * @author María J
 */
public class Mascota {
    protected  String  nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected String sexo;
   protected TipoMascota tipomascota;
   protected Propietario propietario;


public Mascota() {
    }

public Mascota(String nombre, LocalDate fechaNacimiento, 
        double peso, String sexo,TipoMascota tipomascota,Propietario propietario  ){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.sexo = sexo;
        this.tipomascota = tipomascota;
        this.propietario = propietario;
}

    public String getNombre() {
        return nombre;
    }

    public int  getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now ()). getYears();
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public TipoMascota getTipomascota() {
        return tipomascota;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    @Override
    public String toString(){
    return "Mascota{" + "Nombre: " + getNombre() + "edad: " + getEdad() + 
                "peso: " + getPeso() + "sexo: " + getSexo() +
                "TipoMascota=" + tipomascota + ", Propietario:" +getPropietario()+'}';
}
}


