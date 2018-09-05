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
public class Libro {
    private String titulo;
    private int numPag;
    private int calificacion;
    private Autor autor;

    public Libro(String titulo, int numPag, int calificacion, Autor autor) {
        this.titulo = titulo;
        this.numPag = numPag;
        this.calificacion = calificacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
