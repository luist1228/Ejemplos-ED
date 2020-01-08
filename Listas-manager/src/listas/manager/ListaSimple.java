/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.manager;

import java.util.Scanner;

/**
 *
 * @author LuisM
 */
public class ListaSimple {
   protected NS cabeza;
   protected Scanner sc = new Scanner(System.in);

    public NS getCabeza() {
        return cabeza;
    }
   public boolean Vacia(){
   return this.cabeza==null;    
   }
   
   public void recorrerLista(){
       NS aux=this.cabeza;
       
       while(aux!=null){
           aux.presentar();
           aux=aux.getpNext();
       }
   }
   public int contarNodos(){
       NS aux=this.cabeza;
       int cont=0;
       while(aux!=null){
           cont++;
           aux=aux.getpNext();
       }
       return cont;
   }
   public void insertarPrimero(NS newNodo){
       
       if(!this.Vacia()){
           
           newNodo.setpNext(cabeza);
           
       }
       
       this.cabeza=newNodo;
   }
   
   public void insertarUltimo(NS newNodo){
       NS aux=this.cabeza;
       
       if(!this.Vacia()){
           while(aux.getpNext()!=null){
               aux=aux.getpNext();
           }
          aux.setpNext(newNodo);
       }
       else{
           this.cabeza=newNodo;
       }
        
       
   }
   
   public void insertarPosicion(int posicion, NS newNodo){
       
       if(posicion<1||posicion>this.contarNodos()+1){
           System.out.println("no esxiste la posicion");
       }
       else{
           if (posicion==1){
               this.insertarPrimero(newNodo);
           }
           else if(posicion==this.contarNodos()+1){
               this.insertarUltimo(newNodo);
           }
           else{
              NS aux=this.cabeza;
           for(int cuenta=1; cuenta<posicion-1;cuenta++){
              aux=aux.getpNext();  
           }
           
          newNodo.setpNext(aux.getpNext());
          aux.setpNext(newNodo); 
           }
        }
    }
   
   public void ordenarLista(ListaSimple L){
       if(!L.Vacia()){
           NS S=this.cabeza;
           
           while(S.getpNext()!=null){
               NS R=this.cabeza;
               NS min=S;
               NS t=S;
               while(R.getpNext()!=null){
                   
                   if(R.getpNext().getDato()<min.getDato()){
                       t=R;
                   }
                   R=R.getpNext();
               }
               if(min.getDato()!=t.getDato()){
                   NS aux=min;
                   min.setpNext(t.getpNext().getpNext());
                   this.cabeza=t.getpNext();
                   this.cabeza.setpNext(aux.getpNext());
                   t.setpNext(min);
               }
               S=S.getpNext();
           }
       }
   }
}
