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
 * @author JuanCamilo
 */
public class VerificadorIVARegimen2013 implements VerificadorIVA {

    public float obtenerPorcentaje(Bebida b) {
       
        return 0f;
    }

    @Override
    public float obtenerPorcentaje(Plato p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}