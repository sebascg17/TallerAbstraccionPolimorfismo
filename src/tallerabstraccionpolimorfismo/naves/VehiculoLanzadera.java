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
public class VehiculoLanzadera extends Nave{
    
    private boolean estaEnMarcha;
    
    public VehiculoLanzadera(float peso, float empuje){
        super(peso, empuje);
        this.capacidad=118;
        this.longitud=60;
        this.estaEnMarcha=false;        
        
    }  
    
    public void prender(){
        estaEnMarcha = true;
    }
    
    public void despegar(){
        this.empuje = this.empuje + 1000;
    }
    
    public void orbitar(){
        empuje = 0;
        this.estaEnMarcha=false;
    }
    
    public boolean isEstaEnMarcha(){
        return estaEnMarcha;
    }
    
    
}
