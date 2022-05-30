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
public abstract class Nave {
    public float peso;
    public float empuje;
    public float longitud;
    public float capacidad;

    public Nave(float peso, float empuje) {
        this.peso = peso;
        this.empuje = 0;
        this.longitud = 0;
        this.capacidad = 0;
    }
    

    public abstract void despegar();
    
    public abstract void orbitar();
    
    
}
