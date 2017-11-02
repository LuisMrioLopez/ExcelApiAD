/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelapi;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matinal
 */
public class LibroTest {
    
    public LibroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLibro method, of class Libro.
     */
    @Test
    public void testGetLibro() {
        System.out.println("getLibro");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getLibro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibro method, of class Libro.
     */
    @Test
    public void testSetLibro() {
        System.out.println("setLibro");
        String Libro = "";
        Libro instance = new Libro();
        instance.setLibro(Libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHojas method, of class Libro.
     */
    @Test
    public void testGetHojas() {
        System.out.println("getHojas");
        Libro instance = new Libro();
        List<Hoja> expResult = null;
        List<Hoja> result = instance.getHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHojas method, of class Libro.
     */
    @Test
    public void testSetHojas() {
        System.out.println("setHojas");
        List<Hoja> hojas = null;
        Libro instance = new Libro();
        instance.setHojas(hojas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreArchivos method, of class Libro.
     */
    @Test
    public void testGetNombreArchivos() {
        System.out.println("getNombreArchivos");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getNombreArchivos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreArchivos method, of class Libro.
     */
    @Test
    public void testSetNombreArchivos() {
        System.out.println("setNombreArchivos");
        String nombreArchivos = "";
        Libro instance = new Libro();
        instance.setNombreArchivos(nombreArchivos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHoja method, of class Libro.
     */
    @Test
    public void testAddHoja() {
        System.out.println("addHoja");
        
        int filas=20, columnas=30;
        Hoja hoja = new Hoja("pepe" , filas, columnas);
        
        for (int i=0;i<filas; i++){
            for(){
            
            }
        }
        
        Libro instance = new Libro();
        instance.addHoja(hoja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeHoja method, of class Libro.
     */
    @Test
    public void testRemoveHoja() throws Exception {
        System.out.println("removeHoja");
        int index = 0;
        Libro instance = new Libro("Nuevo libro.xsls");
        Hoja expResult = new Hoja("Hoja 1", 5, 5);
        instance.addHoja(expResult);
        
        Hoja result = instance.removeHoja(index);
        assertEquals("Error en remove hoja():",result.compare(expResult), true);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
