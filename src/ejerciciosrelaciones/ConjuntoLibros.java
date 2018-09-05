/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrelaciones;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    private Libro[] libros;

    public ConjuntoLibros() {
        this.libros = new Libro[10];
    }
    public boolean añadirLib(Libro libro){
    for (int i=0; i<10; i++){
        if (this.libros[i]==null) {
            this.libros[i]=libro;
            return true;
        }
    }return false;
    }
    public void eliminarLibroAutor(Autor autor){
        for (int i = 0; i < 10; i++) {
            if (this.libros[i].getAutor()==autor) {
                this.libros[i]=null;
            }
        }
    }
    public void eliminarLibroTitulo(String titulo){
        for (int i = 0; i < 10; i++) {
            if (this.libros[i].getTitulo().equals(titulo)) {
                this.libros[i]=null;
            }
        }
    }

    public Libro[] getLibros() {
        return this.libros;
    }
    public Libro buscarCalificacion(int calificacion){
        Libro mejor = new Libro(null, 0, 0, null); 
        for (int i = 0; i < 10; i++) {
            if (this.libros[i].getCalificacion()==calificacion) {

            }
        }return mejor;
    }
}
