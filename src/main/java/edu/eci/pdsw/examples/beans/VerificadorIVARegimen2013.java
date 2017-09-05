/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.examples.beans;

import edu.eci.pdsw.examples.model.Bebida;
import edu.eci.pdsw.examples.model.Plato;

/**
 *
 * @author Alejandra Gómez & Sebastian Reyes
 */
public class VerificadorIVARegimen2013 implements VerificadorIVA {

    public float obtenerPorcentaje(Bebida b) {
        int cal = b.getCalorias();
        int pre = b.getPrecio();
        return pre*0.29f;
    }

    @Override
    public float obtenerPorcentaje(Plato p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}