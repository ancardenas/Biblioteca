/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrelaciones;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class PruebaLibros {

    public static Scanner lectura =new Scanner(System.in);
    public static void main(String[] args) {
    ConjuntoLibros biblioteca = new ConjuntoLibros();
    Autor autor= new Autor("Gabriel", "Garcia");
    Libro libro = new Libro("Cien Años de Soledad", 300, 8, autor);
    boolean procedimiento =biblioteca.añadirLib(libro);
        if (procedimiento) {
            System.out.println("Procedimiento Exitoso");
        }else{
            System.out.println("Procedimiento fallido"); 
        }
    }
}
