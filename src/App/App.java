/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Dao.*;
import Modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("Joao","Silva",20);
        Pessoa jose = new Pessoa("Jose","Augusto",30);
        Pessoa ronaldo = new Pessoa("Ronaldo", "Santos", 25);
        
        Dao dao = new PessoaDaoVetor();
        
        dao.adicionar(joao);
        dao.adicionar(jose);
        dao.adicionar(ronaldo);
        dao.listarTudo();
        
        System.out.println("Removendo");
        
        dao.remover(joao);
        dao.remover(ronaldo);
        dao.remover(jose);
        dao.listarTudo();
        
        
        
    }
}
