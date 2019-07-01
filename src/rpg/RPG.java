/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;

/**
 *
 * @author 1513 X-MXTI
 */
public class RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               JogadorGuerreiro jogador = new JogadorGuerreiro("Elfhein",15,10);
               Batalha2 batalha1;
               NPCGuerreiro npc1 = new NPCGuerreiro("Teste1",10,10);
               NPCArqueiro  npc2 =  new NPCArqueiro("Teste2",10,10);
               NPCMago      npc3   = new NPCMago("Teste3",10,10);
               Arma espada = new Arma("Espada Longa","Cortante",10,2);
               Armadura armadura = new Armadura("Couraça de Dragão","Armadura Pesada",9);
               Escudo escudo = new Escudo("Couraça de Dragão","Armadura Pesada",9);
               Arma martelo = new Arma("Martelo de Batalha","contusão",12,2);
               jogador.setArma(espada);
               jogador.addEquipamento(martelo);
               jogador.setArmadura(armadura);
               jogador.setEscudo(escudo);
               npc1.setArma(espada);
               npc1.setArmadura(armadura);
               npc1.setEscudo(escudo);
               npc2.setArma(espada);
               npc2.setArmadura(armadura);
               npc2.setEscudo(escudo);
               npc3.setArma(espada);
               npc3.setArmadura(armadura);
               npc3.setEscudo(escudo);
               ArrayList<NPC> inimigos = new ArrayList();
               inimigos.add(npc3);
               inimigos.add(npc2);
               inimigos.add(npc1);
               batalha1= new Batalha2(jogador,inimigos);
               batalha1.batalhar();
               
               
               
    }
    
}
