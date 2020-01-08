/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador.de.todo;

/**
 *
 * @author LuisM
 */
public class NodoA {
    private int data;
    
    private NodoA hijoIzquierdo;
    
    private NodoA hijoDerecho;
    
    public NodoA() {
        
    }
    

    public NodoA(int data) {
        
        this.data = data;
        
        this.hijoIzquierdo = null;
        
        this.hijoDerecho = null;
        
    }
    
    
    public int getData() {
        
        return this.data;
        
    }

    public void setData(int data) {
        
        this.data = data;
        
    }

    public NodoA getHijoIzquierdo() {
        
        return this.hijoIzquierdo;
        
    }

    public void setHijoIzquierdo(NodoA hijoIzquierdo) {
        
        this.hijoIzquierdo = hijoIzquierdo;
        
    }

    public NodoA getHijoDerecho() {
        
        return this.hijoDerecho;
        
    }

    public void setHijoDerecho(NodoA hijoDerecho) {
        
        this.hijoDerecho = hijoDerecho;
        
    }
    
    public void presentar(){
        
        System.out.println("( "+ this.data +" )");
        
    }
    
    public boolean esHoja(){
        
        return this.hijoIzquierdo == null && this.hijoDerecho == null;
    
    }
}
