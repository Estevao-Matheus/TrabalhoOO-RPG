/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author 1513 X-MXTI
 */
public class Arma extends Equipamento {
    
        float AtkBase;
        int   Alcance;

    public Arma(String Nome, String Tipo,float ataque,int alcance) {
        super(Nome, Tipo);
        this.AtkBase = ataque;
        this.Alcance=alcance;
        
    }

 
        
}
