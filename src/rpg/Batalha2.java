/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 1513 X-MXTI
 */
public class Batalha2 {
    
        Jogador jogador;
        ArrayList<NPC> inimigos = new ArrayList();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Random random = new Random();

    public Batalha2(Jogador jogador, ArrayList<NPC> inimigos) {
        this.jogador = jogador;
        this.inimigos = inimigos;
        
    }
    
    public void batalhar()
    {
        while(inimigos.isEmpty()==false)
        {
            
          verificainimigos();
          turnojogador();  
          turnoinimigo();  
            
            
        }    
            
    }
    
    public void verificainimigos()
    {
        
       int i;
       for(i=0;i<inimigos.size();i++)
       {
            if(inimigos.get(i).HP<0)
            {
                
                inimigos.get(i).loot(jogador);
                inimigos.remove(i);
                
            }
            
        }
        
    }    
        
    public void turnojogador()
    {
        
        int i,
            op,
            opp,    
            dano;
        boolean turno=true;
        while(turno==true)
        {
            System.out.println("Escolha:");
            System.out.println("1-Ataque:");
            System.out.println("2-Itens:");
            opp=sc1.nextInt();
            if(opp==1)
            { 
                System.out.println("Qual inimigo deseja atacar:");
                for(i=0;i<inimigos.size();i++)
                {
                    System.out.println(i+" - "+inimigos.get(i).Nome);
                }
                jogador.mostraAtaque();
                op=sc1.nextInt();        
                dano = jogador.chamaataque(i);
                if(dano==-1)
                {
                    System.out.println("Sem MP suficiente para esse ataque");
                }else
                {
                    inimigos.get(op).HP = inimigos.get(op).HP - dano;
                    turno=false;
                }
           }if(opp==2)
           {
               jogador.equipa();
               turno=false;
           }    
       }
    }
    public void turnoinimigo()
    {
        int i,
            rand, 
            dano;
        for(i=0;i<inimigos.size();i++)
        {
            if(inimigos.get(i).MP>60)
            {
                rand = random.nextInt(4)+2;
                dano =inimigos.get(i).chamaataque(rand);
                jogador.HP=jogador.HP-dano;
                System.out.println("Jogador sofreu "+dano+"de dano!");
            }else if(inimigos.get(i).MP<=60&&inimigos.get(i).MP>=0)
            {
                rand = random.nextInt(4)+2;
                dano =inimigos.get(i).chamaataque(rand);
                jogador.HP=jogador.HP-dano;
                System.out.println("Jogador sofreu "+dano+"de dano!");
            }else
            {
                dano=inimigos.get(i).chamaataque(1);
                jogador.HP=jogador.HP-dano;
                System.out.println("Jogador sofreu "+dano+"de dano!");
            }
                
        }
    }   
        
}
         



