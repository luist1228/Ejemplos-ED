/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.base;
import java.util.Scanner;  // Import the Scanner class
/**
 *
 * @author LuisM
 */
public class EjemploBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        //Lista de personas (vacia)
        Persona [] listapersonas=new Persona[10];
        
        //Llenar lista 
        for (int i = 0; i < listapersonas.length; i++) {
            System.out.println("Enter username");
            
            // Read user input
            String userName = myObj.nextLine(); 
            
            //crear objeto Persona y asignarlo a la posicion actual del arreglo
            listapersonas[i]=new Persona(userName); 
        }
        
        //Mostrar Lista de persona completa
        System.out.println("");
        System.out.println("#####LISTADO DE PERSONAS#####");
        for (int i = 0; i < listapersonas.length; i++) {
            System.out.println("P"+i+" "+listapersonas[i].username);
        }
    }
    
}
