/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1513 X-MXTI
 */
public class RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner sc1 = new Scanner(System.in);
               int op;
               String nome;
               Arma espada = new Arma("Espada Longa","Cortante",10,2);
               Armadura armadura = new Armadura("Couraça de Dragão","Armadura Pesada",9);
               Escudo escudo = new Escudo("Couraça de Dragão","Armadura Pesada",9);
               Arma martelo = new Arma("Martelo de Batalha","contusão",12,2); 
               JogadorGuerreiro jogador = new JogadorGuerreiro("",0,0);;
               
               System.out.println("---------------------------------------------------------------------");
               System.out.println("-    1- Novo Jogo -                                                 -");
               System.out.println("-    2- Carregar Status -                                           -");
               System.out.println("_____________________________________________________________________");
               op=sc1.nextInt();
               if(op==1)
               {
                   System.out.println("Digite seu nome: ");
                   nome = sc1.next();
                   jogador= new JogadorGuerreiro(nome,10,10);
                   jogador.setArma(espada);
                   jogador.addEquipamento(martelo);
                   jogador.setArmadura(armadura);
                   jogador.setEscudo(escudo);
                   
               }if(op==2)
               {
                  // BufferedReader buffRead = new BufferedReader("d:\\jogador.txt");
               }
                 
               Cenas cena1 = new Cenas(jogador,"Depois de quase 100 anos de guerra finalmente uma trégua parecia estar proxima"
                       + "Depois de meses nas trincheiras do castelo Von Hoegarth voce finalmente pode voltar para casa e é nisso"
                       + "que você pensao tempo todo, mas derrepente sua diligencia é parada e você vê alguns homens, bandidos"
                       + "roubando para sobreviver derrotados do exército de Britania, deixe que eles tentem a sorte");
               
             cena1.run();
               
               
               
    }
    
}
