/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelapi;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * 
 * Clase que nos permite quear un objeto de tipo libro con
 * una serie de metods para alterar y modificar dicho objeto.
 * Class that allows us to burn a book type object with
 * a series of methods to alter and modify said object

 * Clase Libro y sus atributos
 * @author LuisMario
 */
public class Libro {
    
    private List<Hoja> hojas;
    private String nombreArchivos;
    private Object wb;
    
    /**
     * Constructor de Libro
     */
    public Libro() {
        this.hojas = new ArrayList<>();
        this.nombreArchivos = "nuevo.xlsx";
    }

    public Libro(List<Hoja> hojas, String nombreArchivos) {
        this.hojas = hojas;
        this.nombreArchivos = nombreArchivos;
    }

    Libro(String nuevo_libroxsls) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    /**
     * Generamos los getters y setters de la clase Libro
     */

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
         System.out.println("addHoja");
        
        int filas=20, columnas=30;
        Hoja hoja = new Hoja("pepe" , filas, columnas);
        
        for (int i=0;i<5;i++){
            for (int j=0;j<6;j++){
                hoja.setDato( "Hoja 1:"+i+","+j,i,j);
            }
        }
        
        Libro instance = new Libro();
        instance.addHoja(hoja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        return this.hojas.add(hoja);
    }
    
    /**
     * @param inputFile 
     */
    public void loadHoja(String inputFile) {

        try(FileInputStream fileInputStream = new FileInputStream(new File(inputFile));){
            XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);
            Hoja hoja;
            Row fila;
            Sheet Hoja;
            Cell celda;
            
            int nFilas=0;
            int nColumnas=0;
            int nHojas=0;
      
            Iterator libroIterator = workbook.iterator();
           
            while (libroIterator.hasNext()) {
                Hoja= (Sheet) libroIterator.next();
                nHojas++;
              
                for( int i=0; i < Hoja.getLastRowNum(); i++ ){
                    fila= Hoja.getRow(i);
                    nFilas++;

                    for( int j =0; j <fila.getLastCellNum(); j++ ){
                        celda= fila.getCell(j);
                        nColumnas++;
                    }
                }

                hoja = new Hoja("Hoja"+ nHojas, nFilas, nColumnas);

                

                //volvemos a recorrer la hoja para copiar los datos del excel leido a nuestra hoja

                for( int i=0; i < Hoja.getLastRowNum(); i++ ){
                    fila= Hoja.getRow(i);
                   
                    for( int j =0; j <fila.getLastCellNum(); j++ ){
                        celda= fila.getCell(j);
                    
                        switch(celda.getCellType()){
                           
                            case(Cell.CELL_TYPE_STRING):
                                hoja.setDato(celda.getStringCellValue(), i, j);
                                break;

                            case(Cell.CELL_TYPE_NUMERIC):
                                hoja.setDato(""+celda.getNumericCellValue(), i, j);
                                break;
                                
                            case(Cell.CELL_TYPE_FORMULA):
                                hoja.setDato(celda.getCellFormula().toString(), i, j);
                                break;

                            case(Cell.CELL_TYPE_BOOLEAN):
                                hoja.setDato(""+celda.getBooleanCellValue(), i, j);
                                break;
                                
                            default:
                                hoja.setDato("", i, j);
                                break;
                       
                        }
                    }
                }
               
                hojas.add(hoja);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    /**
     * 
     */
    public void saveHoja(){
        Hoja hoja = new Hoja("Hoja 1", 5, 5);
        for (int i=0;i<5;i++){
            for (int j=0;j<6;j++){
                hoja.setDato( "Hoja 1:"+i+","+j,i,j);
            }
        }
        String filename="testLoadSave.xlsx";
        Workbook wb = new XSSFWorkbook();
        System.out.println("Escribiendo...");
        System.out.println("Leyendo entrada...");
        WorkBook wb2 = new XSSFWorkbook();
        wb2.load();
        assertEquals("Save and load file compare.", true, wb.compare(wb2));
    }
    try (FileOutputStream out = new FileOutputStream(this.nombreArchivos)){
            //introducir un nombre valido
            String termination= this.nombreArchivos.substring(this.nombreArchivos.length()-5,this.nombreArchivos.length());
            System.out.println(termination);

            if(termination.equals(".xlsx") ){

            wb.write(out);

            }else{

                try {
                    throw new ExcelApiException("Nombre de Archivo invalido");
                } catch (ExcelApiException ex) {
                    Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

      
}

    Hoja removeHoja(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Libro instance = new Libro("Nuevo libro.xsls");
        Hoja expResult = new Hoja("Hoja 1", 5, 5);
        instance.addHoja(expResult);
        
        Hoja result = instance.removeHoja(index);
        assertEquals("Error en remove hoja():",result.compare(expResult), true);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        return null;
    }

}

