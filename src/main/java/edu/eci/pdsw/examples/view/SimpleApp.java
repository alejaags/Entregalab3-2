/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.examples.view;

import edu.eci.pdsw.examples.model.Bebida;
import edu.eci.pdsw.examples.model.ExcepcionManejadorOrdenes;
import edu.eci.pdsw.examples.model.Orden;
import edu.eci.pdsw.examples.model.Plato;
import edu.eci.pdsw.examples.services.ManejadorOrdenes;
import edu.eci.pdsw.examples.services.ManejadorOrdenesFactory;

/**
 *
 * @author hcadavid
 */
public class SimpleApp {

    public static void main(String a[]) throws ExcepcionManejadorOrdenes {
        ManejadorOrdenesFactory mo=new ManejadorOrdenesFactory();
        cargarOrdenes(mo);
        
        
        System.out.println(mo.calcularTotalOrden(0));
        System.out.println(mo.calcularTotalOrden(1));
        
    }

    private static void cargarOrdenes(ManejadorOrdenesFactory mo) {

        Orden o = new Orden();
        o.agregarItemOrden(new Plato("pizza", 7500));
        o.agregarItemOrden(new Bebida("pepsi 300ml", 3900,1000));
        o.agregarItemOrden(new Plato("hamburguesa", 8000));
        o.agregarItemOrden(new Bebida("sprite 300ml", 200,2000));

        mo.registrarOrden(o);

        o = new Orden();

        o.agregarItemOrden(new Plato("pizza", 7500));
        o.agregarItemOrden(new Plato("pizza", 7500));
        o.agregarItemOrden(new Plato("pizza", 7500));
        o.agregarItemOrden(new Bebida("pepsi litro", 4000,5000));

        mo.registrarOrden(o);
    }

}
