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
public class Tile {
    
            Personagem personagem;
            String estado;

    public Tile() {
        this.estado = "-";
        this.personagem = null;
    }
    
    public void alocapersonagem (Personagem personagem)
    {
        this.personagem = personagem;
        if(personagem instanceof Jogador)
        {
            this.estado="J";
        }else
            this.estado = "X";
    }
    
    public boolean ocupado()
    {
        if(this.personagem == null)
        {
            return false;
        }else
        {
            return true;
        }
    }
    
}
