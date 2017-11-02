/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelapi;

/**
 *
 * @author matinal
 */
/*class Hoja {

    Hoja(String pepe, int filas, int columnas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    public boolean compare(Hoja hoja){
    boolean iguales = true;
    
    if(this.nColumnas==hoja.getColumnas() && this.nFilas==hoja.getFilas()) && this.nombre.equals(hoja.getNombre()){
        for (int i= 0; i<this.nFilas; i++){
            for (int i= 0; i<this.nColumnas; i++){
                if(!this.datos[i][j].equals(hoja.getDato(i, j) )){
                    iguales = false;
                    break;
                }
        }
            if(!iguales) break;
        }
    }else{
        iguales = false;
    }
    return iguales;
    }
}*/

/**
 * Esta clase almacena información del texto de
 * una hoja de cálculo.
 *
 * @author Acceso a Datos
 */
public class Hoja {
    private String[][] datos;
    private String nombre;

    /**
     * Crea una hoja de cálculo nueva
     */
    public Hoja() {
        this.datos = new String[5][5];
        this.nombre = "";
    }
    
    /**
     * Crea una hoja nueva de tamaño nFilas por nColumnas
     * @param nFilas el número de filas
     * @param nColumnas el número de celdas que tiene cada fila
     */
    public Hoja(int nFilas, int nColumnas) {
        this.datos = new String[nFilas][nColumnas];
        this.nombre="";
    }
    
    public Hoja(String nombre, int nFilas, int nColumnas) {
        this.datos = new String[nFilas][nColumnas];
        this.nombre = nombre;
    }    


    public String getDato(int fila, int columna) {
        return datos[fila][columna];
    }

    public void setDato(String dato, int fila, int columna) {
        this.datos[fila][columna] = dato;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
