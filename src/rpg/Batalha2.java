/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        boolean batalha = true;

    public Batalha2(Jogador jogador, ArrayList<NPC> inimigos) {
        this.jogador = jogador;
        this.inimigos = inimigos;
        
    }
    
    public void batalhar() throws IOException
    {
       
        while(batalha == true)
        {
             if(inimigos.isEmpty()==true)
        {
            this.batalha = false;
        }
        if(jogador.HP<0)
         {
            this.batalha=false;
         } 
            
          
            
          turnojogador();
          verificainimigos();
          turnoinimigo();  
            
            
        } 
        System.out.println("Game Over! Você está morto!");
            
    }
    
    public void verificainimigos()
    {
        
       int i;
       for(i=0;i<inimigos.size();i++)
       {
            if(inimigos.get(i).HP<0)
            {
                
                System.out.println("Inimigo "+inimigos.get(i).Nome+" morto!");
                inimigos.get(i).loot(jogador);
                inimigos.get(i).passaxp(jogador);
                inimigos.remove(i);
                
            }
            
        }
        
    }    
        
    public void turnojogador() throws IOException
    {
        
        int i,
            op,
            opp,
            opatk,    
            dano;
        boolean turno=true;
        while(turno==true)
        {
            System.out.println("¦====================================¦");
            System.out.println("¦"+jogador.Nome+"");
            System.out.println("¦ HP:"+jogador.HP+"");
            System.out.println("¦ MP:"+jogador.MP+"");
            System.out.println("¦Escolha:                            ¦");
            System.out.println("¦1-Ataque:                           ¦");
            System.out.println("¦2-Itens:                            ¦");
            System.out.println("¦3-Salvar                            ¦");
            System.out.println("¦====================================¦");
            opp=sc1.nextInt();
            if(opp==1)
            { 
                System.out.println("====================================");
                System.out.println("Qual inimigo deseja atacar:");
                System.out.println("====================================");
                for(i=0;i<inimigos.size();i++)
                {
                    System.out.println(i+" - "+inimigos.get(i).Nome+" HP: "+inimigos.get(i).HP);
                }
                System.out.println("====================================");
                opatk =sc1.nextInt();
                jogador.mostraAtaque();
                op=sc1.nextInt();        
                dano = jogador.chamaataque(op);
                System.out.println("====================================");
                if(dano==-1)
                {
                    System.out.println("Sem MP suficiente para esse ataque");
                }else
                {
                    int defesainimigo= (int) ((inimigos.get(opatk).armadura.DefBase+inimigos.get(opatk).escudo.DefBase+inimigos.get(opatk).DEF)/3);
                    dano = (dano-defesainimigo);
                    inimigos.get(opatk).HP = inimigos.get(opatk).HP - dano;
                    System.out.println("Inimigo "+inimigos.get(opatk).Nome+" sofreu " +dano+ " de dano!");
                    turno=false;
                }
           }if(opp==2)
           {
               jogador.equipa();
               turno=false;
           }
           if(opp==3)
           {
             //  salvar();
           }
           
       }
    }
    public void turnoinimigo()
    {
        int i,
            rand,
            defesajogador=(int) (jogador.escudo.DefBase+jogador.armadura.DefBase+jogador.DEF),    
            dano;
        for(i=0;i<inimigos.size();i++)
        {
            if(inimigos.get(i).MP>60)
            {
                rand = random.nextInt(4)+2;
                dano =inimigos.get(i).chamaataque(rand)-defesajogador;
                if(dano<0)
                {
                    dano=0;
                }
                jogador.HP=jogador.HP-dano;
                System.out.println("Jogador sofreu "+dano+" de dano!");
            }else if(inimigos.get(i).MP<=60&&inimigos.get(i).MP>=0)
            {
                rand = random.nextInt(4)+2;
                dano =inimigos.get(i).chamaataque(rand)-defesajogador;
                if(dano<0)
                {
                    dano=0;
                }
                jogador.HP=jogador.HP-(dano);
                System.out.println("Jogador sofreu "+dano+" de dano!");
            }else
            {
                dano=inimigos.get(i).chamaataque(1)-defesajogador;
                if(dano<0)
                {
                    dano=0;
                }
                jogador.HP=jogador.HP-(dano-defesajogador);
                System.out.println("Jogador sofreu "+dano+" de dano!");
            }
                
        }
    }   
 /*   public void salvar()
    {
       
     try { 
            FileOutputStream f = new FileOutputStream(new File("jogadorsave.txt"));
                            ObjectOutputStream o = new ObjectOutputStream(f);

                            // Write objects to file
                            o.writeObject(jogador);
                            o.close();
                            f.close();
    }catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException ex) {
                Logger.getLogger(Batalha2.class.getName()).log(Level.SEVERE, null, ex);
            }
            // TODO Auto-generated catch block
            
            // TODO Auto-generated catch block
            
}
*/


}
         



