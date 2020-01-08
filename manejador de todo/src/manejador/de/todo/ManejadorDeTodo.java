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
public class ManejadorDeTodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolBB A1=new ArbolBB();
        A1.insertarNodo(A1.getRaiz(), new NodoA(9));
        A1.insertarNodo(A1.getRaiz(), new NodoA(13));
        A1.insertarNodo(A1.getRaiz(), new NodoA(4));
        A1.insertarNodo(A1.getRaiz(), new NodoA(3));
        A1.insertarNodo(A1.getRaiz(), new NodoA(5));
        A1.insertarNodo(A1.getRaiz(), new NodoA(11));
        
         A1.insertarNodo(A1.getRaiz(), new NodoA(14));
         A1.insertarNodo(A1.getRaiz(), new NodoA(8));
        //A1.recorrerEnOrden(A1.getRaiz());
        System.out.println("");
        //A1.recorrerPostOrden(A1.getRaiz());
        System.out.println("");
        //A1.recorrerPreOrden(A1.getRaiz());
       // System.out.println("su niveñ es"+A1.buscarNivel(A1.getRaiz(), 11, 1)); 
        
        A1.recorrerEnOrden(A1.getRaiz(),9);
      
    }
    
}
