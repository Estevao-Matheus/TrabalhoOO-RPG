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
        this.experiencia=600;
    }
    Random rand = new Random();
    
    public void loot (Jogador jogador)
    {
        int i = rand.nextInt(this.equips.size());
        jogador.addEquipamento(this.equips.get(i));
    }
    public void passaxp (Jogador jogador)
    {
        int xp = (int) (this.experiencia * 0.30);
        jogador.ganhaexperiencia(xp);
        System.out.println("Voce Ganhou "+xp+" pontos de experiencia");
        
    }    
}
