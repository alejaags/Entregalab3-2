/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.examples.beans.impl;

import edu.eci.pdsw.examples.model.*;

/**
 *
 * @author JuanCamilo
 */
public class CalcularCuentaConIva implements CalculadorCuenta{

    @Override
    public int calcularCosto(Orden o) {
        double total=0;
        for (ItemOrden p:o.getItemsOrden()){
                total+=p.getPrecio();
        }
        if (total>15000){
            total = total+(total*0.19);
        }
        return (int)total;
    }

}