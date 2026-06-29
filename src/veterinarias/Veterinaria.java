/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinarias;
import mascotas.Mascota;

/**
 *
 * @author Stef
 */
public class Veterinaria {
    private Mascota[] mascota;
    
    public Mascota buscarMascota(String nombre){
        for(int i=0; i<mascota.length; i++){
            if(mascota[i]!= null){
            if(mascota[i].getNombre().equals(nombre)){
                return mascota[i];
            }
        }
       }
        return null;
    }
    public boolean eliminarMascota(String nombre){
        for(int i=0; i<mascota.length; i ++){
            if(mascota[i] != null){
            if(mascota[i].getNombre().equals(nombre)){
                mascota[i]=null;
            return true;
            }
        }
        }
        return false;
    }
    public boolean mascotaRegistrada(String nombre){
        for(int i = 0; i < mascota.length; i++){
            if(mascota[i] != null){
            if(mascota[i].getNombre().equals(nombre)){
                return true;
            }
         }
       }
      return false;
    }
    public int mascotasRegistradas(String nombre){
        int cont = 0;
        for(int i = 0; i < mascota.length; i ++){
            if(mascota[i] != null){
                cont ++;
            }
        }
        return cont;
    }
 
    
    }
    
    
    

