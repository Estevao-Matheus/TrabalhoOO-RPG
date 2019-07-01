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
public class JogadorMago extends Jogador implements Mago {
            final int MovimentoBase = 3;
            final float AtaqueBase = 6.75f;
            String Ataques[]= {"Great Fireball(40)"," Fireball(20)","Prisma Atack(25)","Atack(10)"};
    
    public JogadorMago(String Nome, int ATK, int DEF) {
        super(Nome, ATK, DEF);
    }

     public void mostraAtaque()
    {
        int i;
        System.out.println("ATAQUES");
        for(i=0;i<Ataques.length;i++)
        {
            System.out.println((i+1)+"-"+Ataques[i]);
        }
    }
     
    @Override
    public int chamaataque(int i) {
        int dano=0;
        if(i==1)
        {
          dano=Atack();
        }
        if(i==2)
        {
          dano=PrismaAtack();
        }
        if(i==3)
        {
            dano=Fireball();
        }
        if(i==4)
        {
           dano=GreatFireball();
        }
        return dano;
    }

 
    @Override
    public int Atack() {
         int dano;    
          dano = (int) (this.arma.AtkBase+this.ATK+this.AtaqueBase);
          return dano;
    }

    @Override
    public int GreatFireball() {
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
    public int Fireball() {
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
    public int PrismaAtack() {
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

   
    public boolean verificamp(int i) {
        if(this.MP<i){
            return true;
        }else
            return false;
    }
    
}
