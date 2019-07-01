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
public class JogadorGuerreiro extends Jogador implements Guerreiro {
    
    final int MovimentoBase = 4;
          float AtaqueBase = 10.75f;
          String Ataques[]= {"Atack(10)","Power Atack20)","Berserk(25)","Thunedring Atack(40)"};
    
    public JogadorGuerreiro(String Nome, int ATK, int DEF) {
        super(Nome, ATK, DEF);
    }
    
    @Override
     public void mostraAtaque()
    {
        int i;
         System.out.println("ATAQUES");
        for(i=0;i<Ataques.length;i++)
        {
            System.out.println((i+1)+"-"+Ataques[i]);
        }
    }
    
    public boolean verificamp(int i)
    {
        if(this.MP<i){
            return true;
        }else
            return false;
    }    
    @Override
    public int chamaataque(int i) {
        
        int dano = 0;
        if(i==4)
        {
            dano= ThunderingAtack();
        }
        if(i==3)
        {
            dano= Berserk();
        }
        if(i==2)
        {
           dano= PowerAtack();
        }
        if(i==1)
        {
            dano= Atack();
        }
        return dano;
    }

    @Override
    public int ThunderingAtack()
    {       
            
            if(verificamp(40)==true)
            {
                return -1;
            }else
            {
            int dano; 
            dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
            dano = (int) (dano + (dano*0.40));
            this.MP=this.MP-40;
            System.out.println("Thundering Attack!");
            return dano;
           }
    }

    @Override
    public int Berserk() {
            if(verificamp(25)==true)
            {
                return -1;
            }else
            {
            int dano; 
            dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
            dano = (int) (dano + (dano*0.25));
            this.MP=this.MP-25;
            System.out.println("Berserk!");
            return dano;
           }
        
    }

    @Override
    public int PowerAtack() {
         if(verificamp(20)==true)
            {
                return -1;
            }else
            {
            int dano; 
            dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
            dano = (int) (dano + (dano*0.20));
            this.MP=this.MP-20;
            System.out.println("Power Atack!");
            return dano;
           }
        
    }

    @Override
    public int Atack(){ 
        int dano;    
        dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
        System.out.println("Atack!");
        return dano;
    }
}
