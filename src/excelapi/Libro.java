/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Libro y sus atributos
 * @author matinal
 */
public class Libro {
    
    private String Libro;
    private List<Hoja> hojas;
    private String nombreArchivos;
    
    /**
     * Constructor de Libro
     */
    public Libro() {
        this.hojas = new ArrayList<>();
        this.nombreArchivos = "nuevo.xlsx";
    }

    
    /**
     * Generamos los getters y setters de la clase Libro
     */
    public String getLibro() {
        return Libro;
    }

    public void setLibro(String Libro) {
        this.Libro = Libro;
    }

    public List<Hoja> getHojas() {
        return hojas;
    }

    public void setHojas(List<Hoja> hojas) {
        this.hojas = hojas;
    }

    public String getNombreArchivos() {
        return nombreArchivos;
    }

    public void setNombreArchivos(String nombreArchivos) {
        this.nombreArchivos = nombreArchivos;
    }
    
    /**
     * 
     * @param hoja
     * @return 
     */
    public boolean addHoja(Hoja hoja){
        return this.hojas.add(hoja);
    }
    
    Hoja removeHoja (int index) {
        return null;
    
     }


}

