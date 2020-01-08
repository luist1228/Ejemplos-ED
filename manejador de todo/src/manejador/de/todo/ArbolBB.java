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
public class ArbolBB {
     private NodoA raiz;
    
    public NodoA getRaiz() {
        
        return this.raiz;
        
    }

    public void setRaiz(NodoA raiz) {
        
        this.raiz = raiz;
        
    }
    
    public boolean estaVacio() {
        
        return this.raiz == null;
        
    }
    
    public void recorrerPreOrden(NodoA aux) {
        
        if(aux != null){
            
            aux.presentar();
            
            this.recorrerPreOrden(aux.getHijoIzquierdo());
            
            this.recorrerPreOrden(aux.getHijoDerecho()); 
            
        }
        
    }
    
    public void recorrerEnOrden(NodoA aux,int dato) {
        
        if(aux != null){
            
            
            if(aux.getData()==dato){
               System.out.println("hola");
           }
            this.recorrerEnOrden(aux.getHijoIzquierdo(),dato);
            
           
            
            this.recorrerEnOrden(aux.getHijoDerecho(),dato); 
            
        }
        
    }
    
    public void recorrerPostOrden(NodoA aux) {
        
        if(aux != null){
            
            this.recorrerPostOrden(aux.getHijoIzquierdo());
            
            this.recorrerPostOrden(aux.getHijoDerecho());
            
            aux.presentar();
            
        }
        
    }
    
    public void insertarNodo(NodoA aux, NodoA nuevo) {
        
        if (estaVacio()) {
            
            this.raiz = nuevo;
            
        }else if (nuevo.getData() < aux.getData()) {
            
            if (aux.getHijoIzquierdo() == null) {
                
		aux.setHijoIzquierdo(nuevo);
                
            }else {
                
                this.insertarNodo(aux.getHijoIzquierdo(), nuevo);
                
            }
            
        }else if (nuevo.getData() > aux.getData()) {
            
            if (aux.getHijoDerecho() == null) {
                
		aux.setHijoDerecho(nuevo);
                
            }else {
                
		this.insertarNodo(aux.getHijoDerecho(), nuevo);
                
            }
            
        }else{
            
            System.out.println("Dicho nodo ya se encuentra dentro del árbol");
            
        }
        
    }
    
    public int contarNodos(NodoA aux) {
        
        if(aux == null) {
            
            return 0;
            
        }else {
            
            return 1 + this.contarNodos(aux.getHijoIzquierdo())+ this.contarNodos(aux.getHijoDerecho());
            
        }
        
    }
    
    public NodoA buscarNodo(NodoA aux, int data) {
        
        if (aux != null) {
            
            if (data < aux.getData()) {

                return this.buscarNodo(aux.getHijoIzquierdo(), data);

            }else if (data > aux.getData()) {

                return this.buscarNodo(aux.getHijoDerecho(), data);

            }else {
                
                return aux;
                
            }
            
        }
        
        return null;
        
    }
    
    public int buscarNivel(NodoA aux, int key, int cont){
        
        if(aux!= null){
            if(key<aux.getData()){
                
                return this.buscarNivel(aux.getHijoIzquierdo(),key,cont+1);
                
            }
            else if(key>aux.getData()){
                
                return this.buscarNivel(aux.getHijoDerecho(),key,cont+1);
                
            }else{
                
                return cont;
                
            }
            
        }else{
            return 0;
        }
        
        
        
    }
    
    public void podar(NodoA aux){
       
        if (aux!=null){
           
            if(aux!=null){
                
                if(aux==this.raiz && aux.esHoja() ){
                    this.raiz=null;
                }else{
                    if(aux.getHijoIzquierdo()!=null){
                        if(aux.getHijoIzquierdo().esHoja()){
                        aux.setHijoIzquierdo(null);
                    }else{
                        podar(aux.getHijoIzquierdo());
                    }
                        
                        
                    }
                    if(aux.getHijoDerecho()!=null){
                     if(aux.getHijoDerecho().esHoja()){
                        aux.setHijoDerecho(null);
                    }else{
                        podar(aux.getHijoDerecho());
                    }   
                    }
                    
                    
                }
                
            }
                    
               
               
           
           
           
            
            
            }
        
     
        }
        
        
    
}
