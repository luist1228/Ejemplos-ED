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
public class ListasManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("que tipo de lista desea crear");
        Scanner sc=new Scanner(System.in);
        int resp=sc.nextInt();
        
        switch(resp){
            case 1:
               
                break;
            default:
                System.out.println("opcion invalida");
                
             
        }
         ListaDoble listaS=new ListaDoble();
        ND n1=new ND(13);
        n1.presentar();
        ND n2=new ND(80);
        n2.presentar();
        ND n3=new ND(23);
        n3.presentar();
        ND n4=new ND(34);
        n4.presentar();
        ND n5=new ND(12);
        n5.presentar();
                
         System.out.println("");
                      System.out.println("");
             listaS.insertarUltimo(n1);
                listaS.insertarUltimo(n2);
                   listaS.insertarUltimo(n3);
                      listaS.insertarUltimo(n4);
                      listaS.insertarUltimo(n5);
                   
                
            
                System.out.println("listaS");
        listaS.ordenarLista(listaS);
           listaS.recorrer();
    }
    
}
