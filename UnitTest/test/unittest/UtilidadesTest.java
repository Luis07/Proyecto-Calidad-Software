/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fifi_
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
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
     * Test of Division method, of class Utilidades.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int dividiendo = 6;
        int divisor = 2;
        Utilidades instance = new Utilidades();
        int expResult = 4;
        int result = instance.Division(dividiendo, divisor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
                                                
    }

    /**
     * Test of Division method, of class Utilidades.
     */
    @Test
    public void testDivisionConCero() {
        System.out.println("Division");
        int dividiendo = 6;
        int divisor = 0;
        Utilidades instance = new Utilidades();
        int expResult = 1;
        int result = instance.Division(dividiendo, divisor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
                                                
    }

    /**
     * Test of ExtraerNumero method, of class Utilidades.
     */
    @Test
    public void testExtraerNumero() {
        System.out.println("ExtraerNumero");
        String cadena = "dhfr";
        Utilidades instance = new Utilidades();
        int expResult = 4;
        int result = instance.ExtraerNumero(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
