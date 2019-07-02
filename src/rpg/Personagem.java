/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1513 X-MXTI
 */
public class Personagem {
    
        String Nome;
        float  ATK,
               DEF; 
        
        int HP,
            MP,    
            experiencia=0;
        Arma  arma;
        Armadura armadura;
        Escudo   escudo;
        ArrayList<Equipamento> equips = new ArrayList();

    public Personagem(String Nome, int ATK, int DEF) {
        this.Nome = Nome;
        this.ATK = ATK;
        this.DEF = DEF;
        this.HP = 100;
        this.MP = 100;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }
        
    public void addEquipamento (Equipamento equip)
    {  
        this.equips.add(equip);
    }
        
    public int chamaataque(int i)
    {
        return 0;
    }
}
