/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.manager;

import java.util.Random;

/**
 *
 * @author LuisM
 */
public class NS {
     private NS pNext;
    private int dato;

    public NS(int dato) {
         Random random = new Random();
         
       // this.dato = random.nextInt(1000) + 1;
        this.dato=dato;
        this.pNext = null;
    }

    public NS getpNext() {
        return pNext;
    }

    public void setpNext(NS pNext) {
        this.pNext = pNext;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
      
    public void presentar(){
        System.out.println("Nodo:dato:"+this.dato);
    }
}
