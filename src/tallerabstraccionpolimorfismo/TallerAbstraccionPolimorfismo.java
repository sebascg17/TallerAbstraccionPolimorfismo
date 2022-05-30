/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabstraccionpolimorfismo;

import javax.swing.JOptionPane;
import tallerabstraccionpolimorfismo.naves.Nave;
import tallerabstraccionpolimorfismo.naves.NaveNoTripulada;
import tallerabstraccionpolimorfismo.naves.NaveTripulada;
import tallerabstraccionpolimorfismo.naves.VehiculoLanzadera;

/**
 *
 * @author sebas
 */
public class TallerAbstraccionPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nave nave;
        boolean isVehiculoLanzadera = true;
        boolean isNaveNoTripulada = true;
        boolean isNaveTripulada = true;
        
        
        
        if(isVehiculoLanzadera){
            nave = new VehiculoLanzadera(2900,3500);
        }else if(isNaveNoTripulada){
            nave = new NaveNoTripulada((float) 0.258,(float) 0.026);           
        }else{
            nave = new NaveTripulada((float) 77,(float) 150); 
        }
        
        nave.despegar();
        nave.orbitar();
        
        String nombreNave = JOptionPane.showInputDialog("ingrese el nombre de una nave");
        int tipoNave = Integer.parseInt(JOptionPane.showInputDialog("Cual tipo de nave es "));
        int empuje = Integer.parseInt(JOptionPane.showInputDialog("Cuanta empuje tiene "));
        
        if(tipoNave == 1){
            if(isVehiculoLanzadera&&empuje>nave.empuje){
                JOptionPane.showMessageDialog(null, "La nave alcanza su velocidad maxima");
            }
            JOptionPane.showMessageDialog(null, "Su nave se llama " + nombreNave + " y es una nave de Lanzadera");
            
        }
        if(tipoNave == 2){
            if(isNaveTripulada&&empuje>nave.empuje){
                JOptionPane.showMessageDialog(null, "La nave alcanza su velocidad maxima");
            }
            JOptionPane.showMessageDialog(null, "Su nave se llama " + nombreNave + " y es una nave no tripulada");
            
        }
        if(tipoNave == 3){
            if(isNaveNoTripulada&&empuje>nave.empuje){
                JOptionPane.showMessageDialog(null, "La nave alcanza su velocidad maxima");
            }
            JOptionPane.showMessageDialog(null, "Su nave se llama " + nombreNave + " y es una nave tripulada");
            
        }
        
        
        
    }
    
}
