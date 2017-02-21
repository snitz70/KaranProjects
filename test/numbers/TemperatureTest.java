/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import numbers.Temperature;

/**
 *
 * @author Brian Snyder
 */
public class TemperatureTest {
    
    public TemperatureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testTempClassIsCreated(){
        Temperature temp = new Temperature("fahrenheit", 32.0);
        assertNotNull(temp);
    }
    
    @Test
    public void testTempFromFarenheit(){
        Temperature fahrenheit = new Temperature("fahrenheit", 32.0);
        Temperature celsius = fahrenheit.toCelsius();
        Temperature kelvin = fahrenheit.toKelvin();
        assertEquals(celsius.temp, 0.0, .001);
        assertEquals(273.15, kelvin.temp, .001);
    }
}
