/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliteca;

/**
 *
 * @author LuisM
 */
public class Cliente {

    public void setLibro(Libros[] Libro) {
        this.Libro = Libro;
    }
    private String nombre;
    private int cedula;
    private Libros Libro [] = new Libros [3];

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    public void agregarLibro(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Libros[] getLibro() {
        return Libro;
    }
    

   
    
    
}
