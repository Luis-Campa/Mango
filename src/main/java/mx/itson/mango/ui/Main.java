/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.ui;

import mx.itson.mango.entidades.Computadora;
import mx.itson.mango.entidades.Television;

/**
 *
 * @author luisantoniocamparubio
 */
public class Main {
    
    public static void main(String[] args) {
        Television tv = new Television("Samsung","XH256");
        
        Computadora pc = new Computadora("Asus","ninja2000",128,1024);
        
        
        System.out.println(tv.encender());
        tv.cambiarVolumen(62);
        pc.encender();
        
        pc.disminuirEspacio(10);
                
        
        int a = 0;
    }
    
}
