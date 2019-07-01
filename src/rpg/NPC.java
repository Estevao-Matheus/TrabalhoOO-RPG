/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Random;

/**
 *
 * @author 1513 X-MXTI
 */
public class NPC extends Personagem {
    
    public NPC(String Nome, int ATK, int DEF) {
        super(Nome, ATK, DEF);
    }
    Random rand = new Random();
    
    public void loot (Jogador jogador)
    {
        int i = rand.nextInt(this.equips.size());
        jogador.addEquipamento(this.equips.get(i));
    }
}
