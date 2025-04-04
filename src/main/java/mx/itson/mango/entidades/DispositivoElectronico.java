/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public abstract class DispositivoElectronico {
    
   private String marca;
    private String modelo;
  
  
    
    public DispositivoElectronico(String marca,String modelo) {
          
          this.marca = marca ;
          this.modelo = modelo;
         
          
    
    }
    
    public String encender(){
        System.out.println(" El dispositivo electronico esta encendido");
       return null;
       
       
    }
    
   public abstract double calcularPrecio(double precio);
    
}
    



    

