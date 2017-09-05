/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.test;

import edu.eci.pdsw.examples.beans.*;
import edu.eci.pdsw.examples.beans.impl.*;
import edu.eci.pdsw.examples.model.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Diseño de pruebas:
 * 
 * Clases de equivalencia:
 *  
 *      CE1: Descripción (matemática o en lenguaje natural).
 *           Resultado esperado: Si es numérico, NO DEBE SER ESPECÍFICO.
 *          
 *      CE2: Descripción (matemática o en lenguaje natural).
 *           Resultado esperado: Si es numérico, NO DEBE SER ESPECÍFICO.
 * 
 *  
 * Condiciones de frontera:
 * 
 *      CF1: Descripción.
 *           Clases de equivalencia relacionadas:
 *           Resultado esperado: Si es numérico, NO DEBE SER ESPECÍFICO.
 * 
 */
public class CalculadorCuentasTest {
    
    public CalculadorCuentasTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void calculadorBasicoCuentasTest() {
        Orden or = new Orden();
        Bebida be = new Bebida("Pepsi", 2000, 100);
        or.agregarItemOrden(be);
        CalculadorBasicoCuentas cbc = new CalculadorBasicoCuentas();
        assertEquals(cbc.calcularCosto(or), 2000);
        
    }
    
    @Test
    public void calculadorCuentaConPropinaTest() {
        Orden or = new Orden();
        Bebida be = new Bebida("Pepsi", 2000, 1001);
        or.agregarItemOrden(be);
        CalculadorCuentaConPropina cccp = new  CalculadorCuentaConPropina();
        assertEquals(cccp.calcularCosto(or), 2580);
        
    }
    
    @Test
    public void calculadorCuentaConIvaTest() {
        Orden or = new Orden();
        Plato pl = new Plato("Bandejapaisa", 2000);
        or.agregarItemOrden(pl);
        CalcularCuentaConIva cci = new  CalcularCuentaConIva();
        assertEquals(cci.calcularCosto(or), 2380);
        
    }
    
}
