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
public class Escudo extends Equipamento {
    
        float DefBase;

    public Escudo(String Nome, String Tipo, float defesa) {
        super(Nome, Tipo);
        this.DefBase=defesa;
    }
        
}
