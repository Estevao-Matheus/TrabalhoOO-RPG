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
public class Cenas {
        ArrayList<NPC> inimigos = new ArrayList();
        Jogador jogador;
        String textocena;
        Batalha2 batalha;

    public Cenas(Jogador jogador, String textocena) {
        this.jogador = jogador;
        this.textocena = textocena;
    }
    
    public void run()
    {
        inimigos();
        System.out.println(" "+textocena);
        batalha = new Batalha2(jogador,inimigos);
        batalha.batalhar();
        
    }
    public void inimigos()
    {
         NPCGuerreiro npc1 = new NPCGuerreiro("Duncan - Guerreiro",10,10);
         NPCArqueiro  npc2 =  new NPCArqueiro("Gedard - Arqueiro",10,10);
         NPCMago      npc3   = new NPCMago("Elrond Mago",10,10);
         Arma espada = new Arma("Espada Longa","Cortante",10,2);
         Armadura armadura = new Armadura("Couraça de Dragão","Armadura Pesada",9);
         Escudo escudo = new Escudo("Couraça de Dragão","Armadura Pesada",9);
         Arma martelo = new Arma("Martelo de Batalha","contusão",12,2);
         npc1.setArma(espada);
               npc1.setArmadura(armadura);
               npc1.setEscudo(escudo);
               npc2.setArma(espada);
               npc2.setArmadura(armadura);
               npc2.setEscudo(escudo);
               npc3.setArma(espada);
               npc3.setArmadura(armadura);
               npc3.setEscudo(escudo);
               npc1.addEquipamento(escudo);
               npc2.addEquipamento(espada);
               npc3.addEquipamento(armadura);
               inimigos.add(npc3);
               inimigos.add(npc2);
               inimigos.add(npc1);
    }
}