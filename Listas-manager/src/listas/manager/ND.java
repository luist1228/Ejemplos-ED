/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.manager;

/**
 *
 * @author LuisM
 */
public class ND {
    private ND pNext;
    private ND anterior;
    private int dato;

    public ND(int dato) {
        this.dato = dato;
    }

    public ND getpNext() {
        return pNext;
    }

    public void setpNext(ND pNext) {
        this.pNext = pNext;
    }

    public ND getAnterior() {
        return anterior;
    }

    public void setAnterior(ND anterior) {
        this.anterior = anterior;
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
