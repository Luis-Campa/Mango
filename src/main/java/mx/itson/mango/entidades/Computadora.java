/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author luisantoniocamparubio
 */
public class Computadora extends DispositivoElectronico {
    
    private int memoriaRAM;
    private int espacioDisco;
    
    
    public Computadora(String marca,String modelo,int memoriaRAM,int espacioDisco){
        super(marca,modelo);
        this.memoriaRAM = memoriaRAM;
        this.espacioDisco = espacioDisco;
        
                
                
    }
    public String disminuirEspacio(int resto){
        
        if(resto > espacioDisco){
            return " El archivo execede el espacio disponible";
        }
        else{
            this.espacioDisco -= resto;
            return "La cantidad del espacio actualizado" + this.espacioDisco;
            
        }    
        
    }
    @Override
    public double calcularDepreciosacion(double precio){
        return precio * 0.12;
    
    
    }
}