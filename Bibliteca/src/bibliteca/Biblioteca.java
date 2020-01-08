/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliteca;
import java.util.Scanner;
/**
 *
 * @author LuisM
 */
public class Biblioteca {
     Scanner sc = new Scanner(System.in);
    private String nombre;
    private Libros Libro [] = new Libros [100];

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void setLibro(Libros[] Libro) {
        this.Libro = Libro;
    }
    
    public void Prestamo(Cliente x){
        System.out.println("Que libro desea pedir");
        String Prestamo=sc.next();
        int y=0;
        for(int i=0; i<10 ;i++){
            if(this.Libro[i].getNombre() == Prestamo && y<1){
                Libros z= this.Libro[i];
            }
        }
        
    }

    public Libros[] getLibro() {
        return Libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
