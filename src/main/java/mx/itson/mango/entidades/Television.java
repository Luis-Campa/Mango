/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Television extends DispositivoElectronico{
    
    private int pulgadas;
    private int volumenActual;
    
    public Television(String marca, String modelo){
        super(marca,modelo);
                
               this.pulgadas = pulgadas;
               this.volumenActual = volumenActual;
    }
    
    public String cambiarVolumen(int cantidad){
        if (cantidad > 0 && cantidad < 100){
            this.volumenActual = cantidad;
            return " se cambio el volumen a" + cantidad;
            
        } else{
            return "El valor debe ser mayor o igual a 0 y menor o igual a 100 ";
        }
        
    }
     @Override
    public String encender(){
               System.out.println(" La television esta cargando");
        return null;
 
         
    }
    
    public double calcularDepreciosacion(double precio){
        return precio * 0.05;
        
    }
       
}
