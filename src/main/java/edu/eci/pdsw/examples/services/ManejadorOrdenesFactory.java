/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.examples.services;
import com.google.inject.AbstractModule;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.pdsw.examples.beans.impl.CalculadorCuenta;
import edu.eci.pdsw.examples.beans.impl.CalculadorCuentaConPropina;
import edu.eci.pdsw.examples.beans.VerificadorIVA;
import edu.eci.pdsw.examples.beans.VerificadorIvaEstandar;
import edu.eci.pdsw.examples.model.ExcepcionManejadorOrdenes;
import edu.eci.pdsw.examples.model.Orden;
/**
 *
 * @author JuanCamilo
 */
public class ManejadorOrdenesFactory {
    private static ManejadorOrdenesFactory instance = new ManejadorOrdenesFactory();
    private ManejadorOrdenes mo = new ManejadorOrdenes();
    private static Injector injector;  
    
    public ManejadorOrdenesFactory(){
        injector = createInjector(new AbstractModule() {

                    
                    protected void configure() {
                        bind(CalculadorCuenta.class).to(CalculadorCuentaConPropina.class);
                        bind(VerificadorIVA.class).to(VerificadorIvaEstandar.class);
                    }
        }
        );
    }
    
    public CalculadorCuenta getCalculador(){
        return injector.getInstance(CalculadorCuenta.class);
    }
    
    public VerificadorIVA getVerificador(){
        return injector.getInstance(VerificadorIVA.class);
    }
    
    public static ManejadorOrdenesFactory getInstance(){
        return instance;
    }

    public int calcularTotalOrden(int i) throws ExcepcionManejadorOrdenes {
        return mo.calcularTotalOrden(i);
    }
    
    public void registrarOrden(Orden o) {
        mo.registrarOrden(o);
    }
}

