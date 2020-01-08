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
public class ListaDoble {
    private ND cabeza;
    private ND cola;

    public ND getCabeza() {
        return cabeza;
    }

    public ND getCola() {
        return cola;
    }
    
    public boolean Vacia(){
        return this.cabeza==null;
    }
    public void recorrer(){
        ND aux=this.cabeza;
        while(aux!=null){
            if(aux==this.cabeza){
                System.out.println("  soy cabeza");
            }
            aux.presentar();
            aux=aux.getpNext();
        }
    }
    public void insertarUltimo(ND newN){
        if(this.cabeza==null){
            this.cabeza=this.cola=newN;
        }else{
            this.cola.setpNext(newN);
            newN.setAnterior(this.cola);
            this.cola=newN;
        }
       
    }
    
    public void ordenarLista(ListaDoble L){
         if(!L.Vacia()){
           ND S=this.cabeza;
            
           while(S!=null){
              ND R=S;
               ND min=S;
               ND t=S;
               while(R.getpNext()!=null){
                    R=R.getpNext();
                   if(R.getDato()<min.getDato()){
                       t=R;
                   }
                  
               }
               if(min.getDato()!=t.getDato()){
                   int aux=min.getDato();
                   min.setDato(t.getDato());
                   t.setDato(aux);
               }
               S=S.getpNext();
           }
       }
    }
}
