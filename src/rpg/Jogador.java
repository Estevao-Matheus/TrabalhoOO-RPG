/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1513 X-MXTI
 */
public class Jogador extends Personagem {
      int nivel;
      
      Scanner sc1 = new Scanner(System.in);

    public Jogador(String Nome, int ATK, int DEF) {
        super(Nome, ATK, DEF);
        this.nivel=1;
        
    }
      
      public void equipa ()
        {
            int i;
            int op;
            System.out.println("Escolha o item que deseja equipar");
            for(i=0;i<equips.size();i++)
            {
                System.out.println(i+"- "+equips.get(i).Nome);
                
            }
            op = sc1.nextInt();
            if(equips.get(op)instanceof Arma)
            {
                this.arma= (Arma) equips.get(op);
            }
            if(equips.get(op)instanceof Armadura)
            {
                this.armadura= (Armadura) equips.get(op);
            }
            if(equips.get(op)instanceof Escudo)
            {
                this.escudo= (Escudo) equips.get(op);
            }
        }
      
      public void passanivel()
      {
          System.out.println("Voce Passou de Nível!");
          this.ATK = (float) (this.ATK+ this.ATK*0.10);
          this.DEF = (float) (this.DEF+ this.DEF*0.10);
          this.nivel++;
      }
      public void ganhaexperiencia(int exp)
      {
          this.experiencia = this.experiencia + exp;
          if(this.experiencia> 500 * (this.nivel ^ 2) - (500 * this.nivel))
          {
              passanivel();
          }
      }
      public void mostraAtaque()
      {
          
      }
    
}
