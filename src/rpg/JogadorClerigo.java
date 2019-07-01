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
public class JogadorClerigo extends Jogador implements Clerigo {
            final int MovimentoBase = 3;
            final float AtaqueBase = 9.80f;
            String Ataques[]= {"Blessing(40)","Power Atack(20)","Joly Atack(25)","Atack(10)"};
    
    public JogadorClerigo(String Nome, int ATK, int DEF) {
        super(Nome, ATK, DEF);
    }

     public void mostraAtaque()
    {
        int i;
         System.out.println("ATAQUES");
        for(i=0;i<Ataques.length;i++)
        {
            System.out.println(i+"-"+Ataques[i]);
        }
    }
    @Override
    public int chamaataque(int i) {
        int dano=0;
        if(i==1)
        {
          dano= Atack();
        }
        if(i==2)
        {
          dano=HolyAtack();
        }
        if(i==3)
        {
          dano= PowerAtack();
        }
        if(i==4)
        {
           dano=Blessing();
        }
        return dano;
    }

    @Override
    public int Blessing() {
              if(verificamp(40)==true)
            {
                return -1;
            }else
            {
            int dano; 
            dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
            dano = (int) (dano + (dano*0.40));
            this.MP=this.MP-40;
            return dano;
           }
    }

    @Override
    public int PowerAtack() {
         if(verificamp(25)==true)
            {
                return -1;
            }else
            {
            int dano; 
            dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
            dano = (int) (dano + (dano*0.25));
            this.MP=this.MP-25;
            return dano;
            }
    }

    @Override
    public int HolyAtack() {
        if(verificamp(20)==true)
            {
                return -1;
            }else
            {
            int dano; 
            dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
            dano = (int) (dano + (dano*0.20));
            this.MP=this.MP-20;
            return dano;
           }
    }

    @Override
    public int Atack() {
          int dano;    
          dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
          return dano;
    }

    @Override
    public boolean verificamp(int i) {
        if(this.MP<i){
            return true;
        }else
            return false;
    }
    
}
