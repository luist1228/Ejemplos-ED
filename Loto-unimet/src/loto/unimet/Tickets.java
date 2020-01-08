/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loto.unimet;
import java.util.Random;
/**
 *
 * @author LuisM
 */
public abstract class Tickets {
   protected int numero;
   protected int costo;
   
    
    public Tickets(){
        Random randomObject = new Random();
        this.numero=randomObject.nextInt(5000) + 1;
        
    }

    public int getNumero() {
        return this.numero;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void getHomosexualidad(){
        System.out.println("Soy super gay y me gusta el pepino");
    }
    
}
