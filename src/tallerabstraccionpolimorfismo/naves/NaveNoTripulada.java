/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccionpolimorfismo.naves;

/**
 *
 * @author sebas
 */
public class NaveNoTripulada extends Nave{
    public boolean estaEnMarcha;
    
    public NaveNoTripulada(float peso, float empuje){
        super(peso, empuje);
        this.capacidad=0;
        this.longitud=60;
        this.estaEnMarcha=false;
        
    }  
    
    @Override
    public void despegar(){
        this.empuje = this.empuje + 2000;
    }
    
    @Override
    public void orbitar(){
        empuje = 0;
        this.estaEnMarcha=false;
    }
    
    
}
